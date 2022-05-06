package com.femxa.app;

import com.femxa.models.Persona;


public class ApMain {

    public static void main(String[] args) {
 //[Nombre_Clase][nombre][instancia(new)][constructor]     
        Persona p1 = new Persona("Ricardo", "Nava", "15264586-G", 83.2f, 1.86f);
        System.out.println(p1.getNombre());
        p1.setNombre("MaxPower");
        System.out.println(p1.getNombre());

    } 
    
}
