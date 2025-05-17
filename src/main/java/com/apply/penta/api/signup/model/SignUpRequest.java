package com.apply.penta.api.signup.model;

import lombok.Data;


@Data
public class SignUpRequest {
    private String email;
    private String password;
}
