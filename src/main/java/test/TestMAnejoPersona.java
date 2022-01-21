/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import datos.*;
import domain.Persona;
import java.util.List;

/**
 *
 * @author Lucas Fredes Ibarra
 */
public class TestMAnejoPersona {

    public static void main(String[] args) {
        PersonaDao personaDao = new PersonaDao();
        List<Persona> personas = personaDao.seleccionar();

        
        //Insertar un nuevo tipo persona
        Persona persona1 = new Persona("Carlos","Esperanza","asfas@asda.com","3242123");
        personaDao.insertar(persona1);
        
        personas.forEach(persona -> {
            System.out.println(persona);
        });
        
    }
}
