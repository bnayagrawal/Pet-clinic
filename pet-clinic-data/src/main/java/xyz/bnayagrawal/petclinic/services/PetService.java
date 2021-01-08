package xyz.bnayagrawal.petclinic.services;

import xyz.bnayagrawal.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
