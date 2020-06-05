package com.springboot.examples.logback.model;


import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author shailesh.modi
 * @version 1.0.0
 * @since 6/5/2020
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Sample {
    String message;


    public Sample(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
