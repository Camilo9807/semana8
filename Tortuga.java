package com.example;

public class Tortuga extends Mascota {
    public Tortuga(String nombre, String especie, String raza, int edad, String tamaño, String color,
            String estadoSalud) {
        super(nombre, especie, raza, edad, tamaño, color, estadoSalud);
    }

    @Override
    public void alimentar() {
        System.out.println(" la tortuga se alimenta de algas.");

    }

    @Override
    public void cuidar() {
        System.out.println("La tortuga necesita baños mensuales y cepillado.");

    }

    @Override
    public void hacerSonido() {
        System.out.println("La tortuga emite sonido al nadar en el agua ");
    }
}
