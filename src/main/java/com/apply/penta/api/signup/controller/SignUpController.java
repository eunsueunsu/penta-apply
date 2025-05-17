package com.apply.penta.api.signup.controller;

import com.apply.penta.api.signup.model.SignUpRequest;
import com.apply.penta.api.signup.model.SignUpResponse;
import com.apply.penta.config.Utils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@RestController
public class SignUpController {

    // DB 제약조건 없으므로  아이디 중복 비교 위한 더미값
    @Value("${mock.emails}")
    private String mockEmails;

    //페이지 리턴
    @GetMapping("/")
    public ModelAndView homepage() {
        ModelAndView mv = new ModelAndView("signup");
        return mv;
    }
    //페이지 리턴
    @GetMapping("/signup")
    public ModelAndView page() {
        ModelAndView mv = new ModelAndView("signup");
        return mv;
    }

    @PostMapping("/api/signup")
    public ResponseEntity<SignUpResponse> signup(@RequestBody SignUpRequest request){

        List<String> mockEmailList = Arrays.asList(mockEmails.split(","));

        // 아이디 중복 검사
        if (mockEmailList.contains(request.getEmail())) {
            return ResponseEntity
                    .status(HttpStatus.CONFLICT)
                    .body(new SignUpResponse("아이디가 중복되었습니다"));
        }

        // 비밀번호 암호화
        String encodedPassword = Utils.encode(request.getPassword());
        System.out.println("암호화된 비밀번호 : " +encodedPassword);


        return ResponseEntity.ok(new SignUpResponse("가입되셨습니다."));
    }





}

