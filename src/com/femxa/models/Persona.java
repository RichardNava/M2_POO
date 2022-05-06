package com.femxa.models;

public class Persona  {
    //CLASS FIELDS 
    private String nombre; //package-private
    private String apellido;
    private String NIF;
    private float peso;
    private float altura;
    
    // CONSTRUCTORES
    public Persona(String nombre, String apellido, String NIF, float peso, float altura) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.NIF = NIF;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona() {
    }
    //Accessors Methods (Getters&Setters)

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
       this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    

    
    
    
    
}
