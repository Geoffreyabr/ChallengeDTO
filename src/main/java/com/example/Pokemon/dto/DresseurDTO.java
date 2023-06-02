package com.example.Pokemon.dto;

import com.example.Pokemon.entity.Pokemon;

import java.util.List;

public class DresseurDTO {

    private String name;
    private List<Pokemon> pokemons;

    public DresseurDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
}
