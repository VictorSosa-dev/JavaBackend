package com.java.backend.crud.controller;


import com.java.backend.crud.model.Client;
import com.java.backend.crud.service.IclientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.naming.Binding;
import javax.validation.Valid;

@Controller
@SessionAttributes("client")
public class ClientControllers {

    private final IclientService clientService;

    @Autowired
    public ClientControllers(IclientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping({"", "/", "/index"})
    public String getAllClients(Model model) {
        model.addAttribute("title", "Listado de clientes");
        model.addAttribute("clients", clientService.getAllClients());
        return "index";
    }

    @GetMapping("/form")
    public String create(Model model) {
        model.addAttribute("title", "Formulario de cliente");
        model.addAttribute("client", new Client());
        return "form";
    }

    @PostMapping("/form")
    public String save(@Valid Client client, BindingResult br, Model model) {
       if (br.hasErrors()) {
           model.addAttribute("title", "Formulario de cliente");
           return "form";
       }
       clientService.createClient(client);
       return "redirect:/index";
    }

    @GetMapping("/form/{id}")
    public String update(@PathVariable Long id, Model model) {
        Client client = null;
        if (id > 0 ) {
            client = clientService.getClient(id);
        } else {
            return "redirect:/index";
        }
        model.addAttribute("title", "Formulario de cliente");
        model.addAttribute("client", client);
        return "form";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id, Model model) {
        if (id > 0) {
            clientService.deleteClient(id);
        }
        return "redirect:/index";
    }
}
