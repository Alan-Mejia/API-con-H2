package com.example.brayan.controller;

import com.example.brayan.model.Persona;
import com.example.brayan.model.PersonaDTO;
import com.example.brayan.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {
    @Autowired
    PersonaService personaService;

    @PostMapping("/post")
    public Persona postPersona(@RequestBody PersonaDTO persona){
        return personaService.save(persona);
    }

    @GetMapping("/all")
    public List<Persona> getAllRecords(){
        return personaService.get();
    }


}
