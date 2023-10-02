package com.java.postwork.s4.controller;

import com.java.postwork.s4.model.Person;
import com.java.postwork.s4.service.DiaryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/agenda")
public class AgendaController {

    private final DiaryService diaryService;

    public AgendaController(DiaryService diaryService) {
        this.diaryService = diaryService;
    }

    @PostMapping
    public ResponseEntity<Person> guardaPersona(@RequestBody Person person) {
        Person resultado = diaryService.savePerson(person);


        if (resultado == null) {
            return ResponseEntity.badRequest().build();
        }


        return ResponseEntity.ok(resultado);
    }

    @GetMapping
    public ResponseEntity<Set<Person>> getPersonas(){
        return ResponseEntity.ok(diaryService.getPeople());
    }
}
