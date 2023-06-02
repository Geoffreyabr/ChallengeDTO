package com.example.Pokemon.services;

import com.example.Pokemon.entity.Pokemon;
import com.example.Pokemon.dto.PokemonDTO;
import org.springframework.stereotype.Service;

@Service
public class PokemonMapper {
    public PokemonDTO pokemonDTO(Pokemon pokemon) {
        PokemonDTO pokeDTO = new PokemonDTO();
        pokeDTO.setName(pokemon.getName());
        pokeDTO.setAttribute(pokemon.getAttribute());
        return pokeDTO;
    }

}
