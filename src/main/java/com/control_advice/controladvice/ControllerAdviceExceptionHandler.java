package com.control_advice.controladvice;

import com.control_advice.dto.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class ControllerAdviceExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ErrorMessage> handleRunTimeException(RuntimeException ex, WebRequest request) {

        // Creating an ErrorMessage object with relevant information
        ErrorMessage errorMessage = new ErrorMessage(
                HttpStatus.INTERNAL_SERVER_ERROR.value(),  // Status code for runtime exception (500)
                new Date(),  // Current timestamp
                ex.getMessage(),  // Exception message
                request.getDescription(false)  // Additional request details
        );

        // Returning ResponseEntity with the error message and HTTP status 500 (Internal Server Error)
        return new ResponseEntity<>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
