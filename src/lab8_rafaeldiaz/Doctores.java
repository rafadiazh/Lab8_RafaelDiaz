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
public class Doctores extends Personas{
    ArrayList<String> especialidades = new ArrayList();
    ArrayList<Paciente> pacientes = new ArrayList();
    String anios, horario;
    ArrayList<String> dias_trabajo = new ArrayList();
    
    public Doctores() {
        super();
    }

    public Doctores(String anios, String horario, String nombre, int edad, String id, Double altura, Double peso, String sexo) {
        super(nombre, edad, id, altura, peso, sexo);
        this.anios = anios;
        this.horario = horario;
    }

    public ArrayList<String> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(ArrayList<String> especialidades) {
        this.especialidades = especialidades;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public String getAnios() {
        return anios;
    }

    public void setAnios(String anios) {
        this.anios = anios;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public ArrayList<String> getDias_trabajo() {
        return dias_trabajo;
    }

    public void setDias_trabajo(ArrayList<String> dias_trabajo) {
        this.dias_trabajo = dias_trabajo;
    }

    @Override
    public String toString() {
        return "Doctor/ra "+super.toString();
    }
    
    
}
