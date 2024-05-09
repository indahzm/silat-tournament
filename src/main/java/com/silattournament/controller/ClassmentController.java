package com.silattournament.controller;

import com.silattournament.service.ClassmentService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("classment")
public class ClassmentController {

    @Autowired
    private ClassmentService classmentService;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("classmentList", classmentService.findAll());
        return "layouts/classment-index";
    }

    @GetMapping("add")
    public ModelAndView addClassment(HttpServletRequest httpServletRequest, ModelAndView modelAndView) {
        modelAndView.setViewName("layouts/classment-form");
        return modelAndView;
    }
}
