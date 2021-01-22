package xyz.bnayagrawal.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import xyz.bnayagrawal.petclinic.model.PetType;

public interface PetRepository extends CrudRepository<PetType, Long> {
}
