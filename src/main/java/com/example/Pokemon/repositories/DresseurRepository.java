package com.example.Pokemon.repositories;

import com.example.Pokemon.entity.Dresseur;
import org.springframework.stereotype.Repository;

@Repository
public interface DresseurRepository {
    Dresseur getTrainerById(Long dresseurId);
}
