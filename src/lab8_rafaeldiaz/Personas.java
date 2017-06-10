/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_rafaeldiaz;

import java.io.Serializable;

/**
 *
 * @author Rafael
 */
public class Personas implements Serializable{
    String nombre;
    int edad;
    String id;
    Double altura, peso;
    String sexo;

    public Personas(String nombre, int edad, String id, Double altura, Double peso, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
    }

    public Personas() {
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
