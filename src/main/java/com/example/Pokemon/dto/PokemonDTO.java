package com.example.Pokemon.dto;

public class PokemonDTO {
    private String name;
    private String attribute;

    public PokemonDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
}
