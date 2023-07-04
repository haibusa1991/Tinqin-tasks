package com.springbeanoverride.dto;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class ResultDto {
    private Double result;
    private UUID uuid;

    private String timestamp;

    public Double getResult() {
        return result;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public ResultDto(Double result) {
        this.result = result;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MM yyyy - HH:mm:ss");
        this.timestamp = LocalDateTime.now().format(dateTimeFormatter);
    }
}
