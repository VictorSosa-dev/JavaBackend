package com.java.postwork.s4.controller;

import com.java.postwork.s4.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.java.postwork.s4.service.DiaryService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class DiaryController {

    private final DiaryService diaryService;

    @Autowired
    public DiaryController(DiaryService diaryService) {
        this.diaryService = diaryService;
    }

    @GetMapping({"/", "/index"})
    public String formRegister(Model model) {
        model.addAttribute("person", new Person());
        model.addAttribute("persons", diaryService.getPeople());

        return "index";
    }

    @PostMapping("/register")
    public ModelAndView register(@Valid Person person) {

        diaryService.savePerson(person);

        ModelAndView modelAndView = new ModelAndView("index");
        //modelAndView.addObject("person", new Person());
        modelAndView.addObject("people", diaryService.getPeople());
        return modelAndView;
    }
}
