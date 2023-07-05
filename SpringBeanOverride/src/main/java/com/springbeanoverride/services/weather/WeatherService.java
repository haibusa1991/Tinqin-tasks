package com.springbeanoverride.services.weather;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface WeatherService {
    Double getTenDaysAverageTemperatures(String city) throws JsonProcessingException;
}
