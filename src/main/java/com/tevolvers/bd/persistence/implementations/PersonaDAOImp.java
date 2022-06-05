package com.tevolvers.bd.persistence.implementations;

import com.tevolvers.bd.entities.Persona;
import com.tevolvers.bd.persistence.interfaces.IPersonaDAO;
import com.tevolvers.bd.utils.SQLServer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAOImp implements IPersonaDAO {
    @Override
    public void insertPerson(Persona persona) {
        Connection connection= SQLServer.connection();
        String query="INSERT  INTO dbo.persona (cedula,nombres,apellido,telefono, edad) " +
                "values (?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement= connection.prepareStatement(query);
            preparedStatement.setString(1, persona.getCedula());
            preparedStatement.setString(2,persona.getNombres());
            preparedStatement.setString(3, persona.getApellido());
            preparedStatement.setString(4,persona.getTelefono());
            preparedStatement.setInt(5,persona.getEdad());
            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println("Could not save record");
            throw new RuntimeException(e);
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Successful registration");
    }

    @Override
    public List<Persona> listPerson() {
        List<Persona> personaList = new ArrayList<>();
        Connection connection= SQLServer.connection();
        String query= "SELECT cedula,nombres,apellido,telefono,edad FROM dbo.persona";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Persona persona = new Persona();
                persona.setCedula(resultSet.getString(1));
                persona.setNombres(resultSet.getString(2));
                persona.setApellido(resultSet.getString(3));
                persona.setTelefono(resultSet.getString(4));
                persona.setEdad(resultSet.getInt(5));
                personaList.add(persona);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return personaList;
    }
}
