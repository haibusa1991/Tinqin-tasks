package com.springbeanoverride.services.rest;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestServiceImpl implements RestService {

    private final RestTemplate restTemplate;

    public RestServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public String getRestResponse(String url) {
        return restTemplate.getForEntity(url, String.class).getBody();
    }
}
