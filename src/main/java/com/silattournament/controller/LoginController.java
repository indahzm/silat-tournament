package com.silattournament.controller;

import com.silattournament.entity.Participant;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.*;

@Controller
public class LoginController {

    @GetMapping
    private String loginPage() { return "login";}
    @PostMapping("/home")
    private String submitLogin(HttpServletRequest request, ModelAndView modelAndView, BindingResult bindingResult) throws IOException {
        return "layouts/home";
    }
}
