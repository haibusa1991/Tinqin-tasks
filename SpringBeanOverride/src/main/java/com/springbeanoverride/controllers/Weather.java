package com.springbeanoverride.controllers;

import com.springbeanoverride.services.weather.WeatherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Weather {

    private final WeatherService weatherService;

    public Weather(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping(path = "/weather")
    public ResponseEntity<String> getTenDaysAverageByCity(@RequestParam String city){
        try {
            return ResponseEntity.ok(this.weatherService.getTenDaysAverageTemperatures(city).toString());
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
