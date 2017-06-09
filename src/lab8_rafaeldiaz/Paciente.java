/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_rafaeldiaz;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Rafael
 */
public class Paciente extends Personas{
    ArrayList<String> enfermedades = new ArrayList();
    Date fecha_ingreso, fecha_dealta;
    String tipo_sangre, causa;
    ArrayList<String> alergias = new ArrayList();
    ArrayList<Organos> organos = new ArrayList();

    public Paciente() {
        super();
    }

    public Paciente(Date fecha_ingreso, Date fecha_dealta, String tipo_sangre, String causa, String nombre, int edad, String id, Double altura, Double peso, String sexo) {
        super(nombre, edad, id, altura, peso, sexo);
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_dealta = fecha_dealta;
        this.tipo_sangre = tipo_sangre;
        this.causa = causa;
    }

    public ArrayList<String> getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(ArrayList<String> enfermedades) {
        this.enfermedades = enfermedades;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public Date getFecha_dealta() {
        return fecha_dealta;
    }

    public void setFecha_dealta(Date fecha_dealta) {
        this.fecha_dealta = fecha_dealta;
    }

    public String getTipo_sangre() {
        return tipo_sangre;
    }

    public void setTipo_sangre(String tipo_sangre) {
        this.tipo_sangre = tipo_sangre;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    public ArrayList<String> getAlergias() {
        return alergias;
    }

    public void setAlergias(ArrayList<String> alergias) {
        this.alergias = alergias;
    }

    public ArrayList<Organos> getOrganos() {
        return organos;
    }

    public void setOrganos(ArrayList<Organos> organos) {
        this.organos = organos;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
