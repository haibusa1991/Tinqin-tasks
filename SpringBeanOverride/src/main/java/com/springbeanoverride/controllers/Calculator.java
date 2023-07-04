package com.springbeanoverride.controllers;

import com.springbeanoverride.dto.RequestDto;
import com.springbeanoverride.dto.ResultDto;
import com.springbeanoverride.services.calculator.CalculatorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {
    private final CalculatorService calculatorService;

    public Calculator(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @PostMapping(path = "/multiply")
    public ResultDto getMultiplicationResult(@RequestBody RequestDto dto) {

        return this.calculatorService.multiply(dto);
    }
}
