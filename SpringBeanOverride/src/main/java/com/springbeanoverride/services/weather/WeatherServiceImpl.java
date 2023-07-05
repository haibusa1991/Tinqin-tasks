package com.springbeanoverride.services.weather;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springbeanoverride.services.rest.RestService;
import org.springframework.stereotype.Service;

@Service
public class WeatherServiceImpl implements WeatherService {
    private final RestService restService;
    private final ObjectMapper objectMapper;

    public WeatherServiceImpl(RestService restService, ObjectMapper objectMapper) {
        this.restService = restService;
        this.objectMapper = objectMapper;
    }

    @Override
    public Double getTenDaysAverageTemperatures(String city) throws JsonProcessingException {
        String response = this.restService.getRestResponse(getRequestUrl(city));

        return objectMapper.readTree(response)
                .findValue("forecast")
                .findValue("forecastday")
                .findValues("day")
                .stream()
                .map(day -> day.findValue("avgtemp_c"))
                .map(JsonNode::asDouble)
                .mapToDouble(d -> d)
                .average()
                .orElse(-1);
    }

    private String getRequestUrl(String city) {
        return "http://api.weatherapi.com/v1/forecast.json?key=cdf52c3a959e482084775517230507&q=" + city + "&days=10&aqi=no&alerts=no";
    }
}
