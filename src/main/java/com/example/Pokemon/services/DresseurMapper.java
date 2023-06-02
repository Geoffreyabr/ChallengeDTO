package com.example.Pokemon.services;

import com.example.Pokemon.entity.Dresseur;
import com.example.Pokemon.dto.DresseurDTO;
import org.springframework.stereotype.Service;

@Service
public class DresseurMapper {

       public DresseurDTO toDto(Dresseur dresseur) {
        DresseurDTO trainerDTO = new DresseurDTO();
        trainerDTO.setName(dresseur.getName());
        trainerDTO.setPokemons(dresseur.getPokemons());
        return trainerDTO;
    }

}
