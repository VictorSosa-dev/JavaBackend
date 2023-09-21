package com.java.backend.s7.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SaludoController {

    @GetMapping("/hola")
    public ModelAndView hola() {
        ModelAndView mav = new ModelAndView("Hola");

        mav.addObject("mensaje", "Hola desde thymeleaf");
        return mav;
    }

    @GetMapping("/hola2")
    public ModelAndView holaNombre(@RequestParam(name = "mensaje") String nombre) {
        ModelAndView mav = new ModelAndView("Hola");

        mav.addObject("mensaje", "Hola " + nombre + " desde thymeleaf");
        return mav;
    }
}
