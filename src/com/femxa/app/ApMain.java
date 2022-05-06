package com.femxa.app;

import com.femxa.models.Humano;
import com.femxa.models.PJ;


public class ApMain extends Humano {

    public static void main(String[] args) {
 //[Nombre_Clase][nombre][instancia(new)][constructor]     
        Humano p1 = new Humano("Ricardo", "Nava", "15264586-G", 83.2f, 1.86f);
        System.out.println(p1.getNombre());
        //p1.setNombre("MaxPower");
        //System.out.println(p1.getNombre());
        System.out.println(p1);
        
        PJ pj1 = new PJ(80, 50, 65, "Krull", "Machacraneos", "24325900D", 98.5f, 2.00f);
        pj1.luchar();
        
    } 
    
}
