/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.femxa.models;

/**
 *
 * @author richa
 */
public class PJ extends Humano{ 
    private int fuerza;
    private int salud;
    private int resistencia;

//    public PJ(int fuerza, int salud, int resistencia) {
//        this.fuerza = fuerza;
//        this.salud = salud;
//        this.resistencia = resistencia;
//    }
//
//    public PJ() {
//    }

    public PJ(int fuerza, int salud, int resistencia, String nombre, String apellido, String NIF, float peso, float altura) {
        super(nombre, apellido, NIF, peso, altura);
        this.fuerza = fuerza;
        this.salud = salud;
        this.resistencia = resistencia;
    }

    public PJ() {
        super();
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    @Override
    public String toString() {
        return super.toString() + 
               "\nFuerza=" + fuerza + 
               "\nSalud=" + salud + 
               "\nResistencia=" + resistencia;
    }

    
}
