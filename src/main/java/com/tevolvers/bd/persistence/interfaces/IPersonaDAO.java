package com.tevolvers.bd.persistence.interfaces;

import com.tevolvers.bd.entities.Persona;

import java.util.List;

public interface IPersonaDAO {
    void insertPerson(Persona persona);
    List<Persona> listPerson();

}
