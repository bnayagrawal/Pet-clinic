package xyz.bnayagrawal.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import xyz.bnayagrawal.petclinic.model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
