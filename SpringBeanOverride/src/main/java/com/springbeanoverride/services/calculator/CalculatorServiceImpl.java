package com.springbeanoverride.services.calculator;

import com.springbeanoverride.dto.RequestDto;
import com.springbeanoverride.dto.ResultDto;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public ResultDto multiply(RequestDto dto) {

        return new ResultDto(Double.parseDouble(dto.getOperand1())
                        * Double.parseDouble(dto.getOperand2()));
    }
}
