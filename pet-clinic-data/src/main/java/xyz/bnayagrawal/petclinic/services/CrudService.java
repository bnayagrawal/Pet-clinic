package xyz.bnayagrawal.petclinic.services;

import xyz.bnayagrawal.petclinic.model.Pet;
import xyz.bnayagrawal.petclinic.model.Vet;

import java.util.Set;

public interface CrudService<T> {

    T findById(Long id);

    Set<T> findAll();

    T save(T object);

    void delete(T object);

    void deleteById(Long id);
}
