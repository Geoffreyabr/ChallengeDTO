package com.example.Pokemon.controllers;

import com.example.Pokemon.entity.Pokemon;
import com.example.Pokemon.dto.PokemonDTO;
import com.example.Pokemon.repositories.PokemonRepository;
import com.example.Pokemon.services.PokemonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pokemons")
public class PokemonController {
    @Autowired
    private PokemonMapper pokemonMapper;

    @Autowired
    private PokemonRepository pokemonRepository;

    @GetMapping("/{name}")
    public ResponseEntity<?> getPokemonByName(@PathVariable String name) {
        Pokemon pokemon = pokemonRepository.findByName(name);
        PokemonDTO pokemonDTO = pokemonMapper.pokemonDTO(pokemon);
        return ResponseEntity.ok(pokemonDTO);
    }
}
