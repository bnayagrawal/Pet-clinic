package xyz.bnayagrawal.petclinic.services;

import xyz.bnayagrawal.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner> {

    Owner findByLastName(String lastName);
}
