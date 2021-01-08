package xyz.bnayagrawal.petclinic.services;

import xyz.bnayagrawal.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
