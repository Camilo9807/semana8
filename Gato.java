package com.example;

public class Gato extends Mascota {
    public Gato(String nombre, String especie, String raza, int edad, String tamaño, String color, String estadoSalud) {
        super(nombre, especie, raza, edad, tamaño, color, estadoSalud);
    }

    @Override
    public void alimentar() {
        System.out.println( " El perro se alimenta con croquetas y comida húmeda.");
        
    }

    @Override
    public void cuidar() {
        System.out.println("El Gato necesita baños mensuales y cepillado.");
        
    }

    @Override
    public void hacerSonido() {
    System.out.println("El Gato hace: Miauu Miauu");        
    }
}
