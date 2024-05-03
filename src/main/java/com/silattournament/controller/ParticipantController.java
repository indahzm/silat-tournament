package com.silattournament.controller;

import com.silattournament.service.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
