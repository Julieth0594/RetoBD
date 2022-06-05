package com.tevolvers.bd.entities;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.Serializable;

public class Persona implements Serializable {
    private String cedula;
    private String nombres;
    private String apellido;
    private String telefono;
    private int edad;

    public Persona(String cedula, String nombres, String apellido, String telefono, int edad) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellido = apellido;
        this.telefono = telefono;
        this.edad = edad;
    }

    public Persona() {
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "cedula='" + cedula + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apellido='" + apellido + '\'' +
                ", telefono='" + telefono + '\'' +
                ", edad=" + edad +
                '}';
    }
}
