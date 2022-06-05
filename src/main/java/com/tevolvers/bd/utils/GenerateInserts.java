package com.tevolvers.bd.utils;

import com.tevolvers.bd.business.PersonaBusiness;
import com.tevolvers.bd.entities.Persona;

public class GenerateInserts {
    static PersonaBusiness personaBusiness = new PersonaBusiness();
    public static void ofPersons(){
        for (int i=0;i<6;i++){
            Persona persona= new Persona();
            persona.setCedula(GenerateRandom.numberString());
            persona.setNombres(GenerateRandom.letters());
            persona.setApellido(GenerateRandom.letters());
            persona.setTelefono(GenerateRandom.numberString());
            persona.setEdad(GenerateRandom.numbers());
            personaBusiness.insertPerson(persona);
        }
    }


}
