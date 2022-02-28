package com.example.brayan.service;

import com.example.brayan.model.Persona;
import com.example.brayan.model.PersonaDTO;

import java.util.List;

public interface PersonaService {
    Persona save(PersonaDTO personaDTO);
    List<Persona> get();
}
