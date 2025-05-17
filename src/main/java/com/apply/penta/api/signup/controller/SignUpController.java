package com.apply.penta.api.signup.controller;

import com.apply.penta.api.signup.model.SignUpRequest;
import com.apply.penta.api.signup.model.SignUpResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class SignUpController {

    //페이지 리턴
    @GetMapping("/signup")
    public ModelAndView page() {
        ModelAndView mv = new ModelAndView("signup");
        return mv;
    }

    @PostMapping("/api/signup")
    public ResponseEntity<SignUpResponse> signup(@RequestBody SignUpRequest request){

        return ResponseEntity.ok(new SignUpResponse("가입되셨습니다."));
    }

}

