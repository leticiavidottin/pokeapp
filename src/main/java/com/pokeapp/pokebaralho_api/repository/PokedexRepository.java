package com.pokeapp.pokebaralho_api.repository;

import com.pokeapp.pokebaralho_api.entity.Pokedex;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PokedexRepository extends JpaRepository<Pokedex, Integer> {

    Optional<Pokedex> findByNameIgnoreCase(String name);

    Optional<Pokedex> findByNationalNumber(Long nationalNumber);
}