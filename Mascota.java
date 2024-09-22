package com.example;

public abstract class Mascota {
    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    private String tamaño;
    private String color;
    private String estadoDeSalud;

    public Mascota(String nombre, String especie, String raza, int edad, String tamaño, String color,
            String estadoSalud) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
        this.color = color;
        this.estadoDeSalud = estadoSalud;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEstadoDeSalud(String estadoDeSalud) {
        this.estadoDeSalud = estadoDeSalud;
    }

    public abstract void hacerSonido();

    public abstract void alimentar();

    public abstract void cuidar();

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Raza: " + raza);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Tamaño: " + tamaño);
        System.out.println("Color: " + color);
        System.out.println("Estado de salud: " + estadoDeSalud);

    }
}
