package com.tevolvers.bd;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.tevolvers.bd.business.PersonaBusiness;
import com.tevolvers.bd.entities.Persona;
import com.tevolvers.bd.utils.GenerateInserts;

public class Main {
    public static void main(String[] args) {
        GenerateInserts.ofPersons();
        PersonaBusiness personaBusiness = new PersonaBusiness();
        Iterable<Persona>  personaIterable = personaBusiness.listPerson();
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        for (Persona p : personaIterable){
            System.out.println(gson.toJson(p));
        }

    }
}
