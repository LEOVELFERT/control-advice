package com.control_advice.dto;

import java.util.Date;

public class ErrorMessage {
    private int status;
    private Date timestamp;
    private String message;
    private String description;

    public ErrorMessage(int status, Date timestamp, String message, String description) {
        this.status = status;
        this.timestamp = timestamp;
        this.message = message;
        this.description = description;
    }
}
