package com.silattournament.controller;

import com.silattournament.service.ParticipantService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("participant")
public class ParticipantController {

    @Autowired
    private ParticipantService participantService;

    @GetMapping()
    public String index(Model model) {

        model.addAttribute("participantList", participantService.findAll());
//        return "participant/index";
        return "layouts/participant-index";
    }

    @GetMapping("add")
    public ModelAndView addParticipant(HttpServletRequest request, ModelAndView modelAndView) {
        System.out.println("TEST");
        modelAndView.setViewName("layouts/participant-form");
        return modelAndView;
    }

}
