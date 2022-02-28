package com.example.brayan.serviceimpl;

import com.example.brayan.model.Persona;
import com.example.brayan.model.PersonaDTO;
import com.example.brayan.repository.PersonaRepository;
import com.example.brayan.service.PersonaService;
import jdk.internal.module.ModuleLoaderMap;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    PersonaRepository personaRepository;

    @Override
    public Persona save(PersonaDTO personaDTO) {

        ModelMapper modelMapper = new ModelMapper();
        Persona persona1 = modelMapper.map(personaDTO, Persona.class);
        persona1.setAge(1);
        return personaRepository.save(persona1);
    }

    @Override
    public List<Persona> get() {
        List<Persona> listaDePersonas= personaRepository.findAll();
        return listaDePersonas;
    }
}
