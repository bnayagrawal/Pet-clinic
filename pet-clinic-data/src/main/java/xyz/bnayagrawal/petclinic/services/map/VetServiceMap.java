package xyz.bnayagrawal.petclinic.services.map;

import xyz.bnayagrawal.petclinic.model.Vet;
import xyz.bnayagrawal.petclinic.services.CrudService;
import xyz.bnayagrawal.petclinic.services.VetService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet> implements VetService {
    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
