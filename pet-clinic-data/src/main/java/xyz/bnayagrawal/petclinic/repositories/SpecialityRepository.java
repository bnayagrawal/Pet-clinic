package xyz.bnayagrawal.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import xyz.bnayagrawal.petclinic.model.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
