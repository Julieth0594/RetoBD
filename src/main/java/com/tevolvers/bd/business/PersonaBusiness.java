package com.tevolvers.bd.business;

import com.tevolvers.bd.entities.Persona;
import com.tevolvers.bd.persistence.implementations.PersonaDAOImp;

import java.util.List;

public class PersonaBusiness {
    PersonaDAOImp personaDAOImp = new PersonaDAOImp();

    public void insertPerson(Persona persona) {
        personaDAOImp.insertPerson(persona);
    }

    public List<Persona> listPerson(){
        return personaDAOImp.listPerson();
    }
}
