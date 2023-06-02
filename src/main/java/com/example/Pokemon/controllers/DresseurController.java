package com.example.Pokemon.controllers;

import com.example.Pokemon.dto.DresseurDTO;
import com.example.Pokemon.entity.Dresseur;
import com.example.Pokemon.repositories.DresseurRepository;
import com.example.Pokemon.services.DresseurMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DresseurController {

    @Autowired
    DresseurMapper dresseurMapper;

    @Autowired
    DresseurRepository dresseurRepository;

    @GetMapping("/{dresseurId}")
    public ResponseEntity<DresseurDTO> getDresseurWithPokemons(@PathVariable Long dresseurId) {
        Dresseur dresseur = dresseurRepository.getTrainerById(dresseurId);
        DresseurDTO dresseurDTO = dresseurMapper.toDto(dresseur);
        return ResponseEntity.ok(dresseurDTO);
    }
}
