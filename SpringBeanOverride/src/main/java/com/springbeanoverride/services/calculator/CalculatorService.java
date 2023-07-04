package com.springbeanoverride.services.calculator;

import com.springbeanoverride.dto.RequestDto;
import com.springbeanoverride.dto.ResultDto;

public interface CalculatorService {
    ResultDto multiply(RequestDto dto);
}
