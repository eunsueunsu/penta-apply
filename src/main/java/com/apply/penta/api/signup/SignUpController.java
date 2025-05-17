package com.apply.penta.api.signup;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class SignUpController {

    //페이지 리턴
    @RequestMapping("/signup")
    public ModelAndView page() {
        ModelAndView mv = new ModelAndView("signup");
        return mv;
    }

}

