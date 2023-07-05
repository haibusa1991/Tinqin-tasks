package com.springbeanoverride.configuration;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class Playground implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        RestTemplate restTemplate = new RestTemplate();

//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create("http://api.weatherapi.com/v1/forecast.json?key=cdf52c3a959e482084775517230507&q=Varna&days=2&aqi=no&alerts=no"))
//                .build();
//
//        HttpClient client = HttpClient.newHttpClient();
//
//        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//
//
//        String uri = "http://api.weatherapi.com/v1/forecast.json?key=cdf52c3a959e482084775517230507&q=Varna&days=2&aqi=no&alerts=no";
//        ResponseEntity<String> response = restTemplate.getForEntity(uri, String.class);
//
//        ObjectMapper objectMapper = new ObjectMapper();
//        List<Double> temps = objectMapper.readTree(response.getBody())
//                .findValue("forecast")
//                .findValue("forecastday")
//                .findValues("day")
//                .stream().map(day -> day.findValue("avgtemp_c"))
//                .map(JsonNode::asDouble).toList();
//
//        System.out.println();
    }
}
