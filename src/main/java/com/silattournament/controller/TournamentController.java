package com.silattournament.controller;

import com.silattournament.service.TournamentService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("tournament")
public class TournamentController {

    @Autowired
    private TournamentService tournamentService;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("tournamentList", tournamentService.findAll());
        return "layouts/tournament-index";
    }

    @GetMapping("add")
    public ModelAndView addTournament(HttpServletRequest httpServletRequest, ModelAndView modelAndView) {
        modelAndView.setViewName("layouts/tournament-form");
        return modelAndView;
    }

}
