package xyz.bnayagrawal.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import xyz.bnayagrawal.petclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);
}
