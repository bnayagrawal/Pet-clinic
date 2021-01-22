package xyz.bnayagrawal.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import xyz.bnayagrawal.petclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
