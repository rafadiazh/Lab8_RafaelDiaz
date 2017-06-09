/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_rafaeldiaz;

import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class Organos {
    String nombre;
    String Color;
    
    ArrayList<String> caracteristicas = new ArrayList();
    double nivel_efectividad;
    double nivel_potenciado;
    double nivel_prueba;

    public Organos() {
    }

    public Organos(String nombre, String Color, double nivel_efectividad, double nivel_potenciado, double nivel_prueba) {
        this.nombre = nombre;
        this.Color = Color;
        this.nivel_efectividad = nivel_efectividad;
        this.nivel_potenciado = nivel_potenciado;
        this.nivel_prueba = nivel_prueba;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public ArrayList<String> getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(ArrayList<String> caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public double getNivel_efectividad() {
        return nivel_efectividad;
    }

    public void setNivel_efectividad(double nivel_efectividad) {
        this.nivel_efectividad = nivel_efectividad;
    }

    public double getNivel_potenciado() {
        return nivel_potenciado;
    }

    public void setNivel_potenciado(double nivel_potenciado) {
        this.nivel_potenciado = nivel_potenciado;
    }

    public double getNivel_prueba() {
        return nivel_prueba;
    }

    public void setNivel_prueba(double nivel_prueba) {
        this.nivel_prueba = nivel_prueba;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
