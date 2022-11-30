/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cafetera;

/**
 *
 * @author fer
 */
public class Persona {

    private int edad;
    private int nombre;

    public Persona(int edad, int nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", nombre=" + nombre + '}';
    }

    public void hacerCafe(Cafetera c) {
        
        c.setCantidadActual(1000);
    }
    
    public void beberCafe(Cafetera c, int cantidad) {
        
       c.
        
    }

}
