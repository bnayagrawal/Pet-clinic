package xyz.bnayagrawal.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import xyz.bnayagrawal.petclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
