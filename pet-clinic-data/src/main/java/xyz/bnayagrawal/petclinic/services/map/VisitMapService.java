package xyz.bnayagrawal.petclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import xyz.bnayagrawal.petclinic.model.Owner;
import xyz.bnayagrawal.petclinic.model.Pet;
import xyz.bnayagrawal.petclinic.model.Visit;
import xyz.bnayagrawal.petclinic.services.VisitService;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class VisitMapService extends AbstractMapService<Visit> implements VisitService {
    
    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit save(Visit object) {
        final Pet pet = object.getPet();
        final Owner owner = null == pet ? null : pet.getOwner();

        if(pet == null || pet.getId() == null || owner == null || owner.getId() == null)
            throw new RuntimeException("Invalid Visit");

        return super.save(object);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
