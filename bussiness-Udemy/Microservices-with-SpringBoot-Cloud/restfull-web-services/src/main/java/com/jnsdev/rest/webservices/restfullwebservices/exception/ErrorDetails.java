package com.jnsdev.rest.webservices.restfullwebservices.exception;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @Autor Jairo Nascimento
 * @Created 29/11/2022 - 17:27
 */
public class ErrorDetails {

    private LocalDateTime timestamp;
    private String message;
    private String details;

    public ErrorDetails(LocalDateTime timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }

}
