package xyz.bnayagrawal.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import xyz.bnayagrawal.petclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
