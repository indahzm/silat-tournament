package com.silattournament.controller;

import com.silattournament.entity.Competition;
import com.silattournament.service.CompetitionService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
@RequestMapping("competition")
public class CompetitionController {
    @Autowired
    private CompetitionService competitionService;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("competitionList", competitionService.findAll());
        return "layouts/competition-index";
    }

    @GetMapping("add")
    public ModelAndView addCompetition(HttpServletRequest httpServletRequest, ModelAndView modelAndView) {
        modelAndView.addObject("competition", new Competition());
        modelAndView.setViewName("layouts/competition-form");
        return modelAndView;
    }

    @GetMapping("edit/{id}")
    public ModelAndView addCompetition(HttpServletRequest httpServletRequest, ModelAndView modelAndView, @PathVariable String id) {
        modelAndView.addObject("competition", competitionService.findById(id));
        modelAndView.setViewName("layouts/competition-form");
        return modelAndView;
    }

    @PostMapping("save")
    public ModelAndView saveCompetition(HttpServletRequest request, ModelAndView modelAndView, Competition competition, BindingResult bindingResult) throws IOException {
        competitionService.save(competition);
        modelAndView.setViewName("redirect:/competition");
        return modelAndView;
    }
}
