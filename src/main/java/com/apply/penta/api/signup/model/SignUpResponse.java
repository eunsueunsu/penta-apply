package com.apply.penta.api.signup.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class SignUpResponse {
    private String message;


    public SignUpResponse(String message) {
        this.message = message;
    }
}
