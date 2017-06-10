/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8_rafaeldiaz;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class adminPersonas {
    ArrayList<Paciente> pacientes = new ArrayList();
    ArrayList<Doctores> doctores = new ArrayList();
    File archivo = null;
    
    public adminPersonas(String path) {
        archivo = new File(path);
    }
    

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public ArrayList<Doctores> getDoctores() {
        return doctores;
    }

    public void setDoctores(ArrayList<Doctores> doctores) {
        this.doctores = doctores;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "pacientes=" + pacientes + "/ndoctores=" + doctores + '}';
    }
    public void setPaciente(Paciente p){
        this.pacientes.add(p);
    }
    
    
    
    public void cargarArchivo(){
        try {
            pacientes = new ArrayList();
            Paciente temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while((temp =(Paciente)objeto.readObject())!= null){
                        pacientes.add(temp);
                        
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
                
            }
        } catch (Exception e) {}
    }
    
    public void escribirArchivo(){
        FileOutputStream fo = null;
        ObjectOutputStream oo = null;
        try {
            fo = new FileOutputStream(archivo);
            oo = new ObjectOutputStream(fo);
            for (Paciente t : pacientes) {
                oo.writeObject(t);
            }
            oo.flush();
        } catch (Exception e) {
        }
        try {
            oo.close();
            oo.close();
        } catch (Exception e) {
        }
    }
    public void setDoctores(Doctores p){
        this.doctores.add(p);
    }
    
    
    
    public void cargarArchivo2(){
        try {
            doctores = new ArrayList();
            Doctores temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while((temp =(Doctores)objeto.readObject())!= null){
                        doctores.add(temp);
                        
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
                
            }
        } catch (Exception e) {}
    }
    
    public void escribirArchivo2(){
        FileOutputStream fo = null;
        ObjectOutputStream oo = null;
        try {
            fo = new FileOutputStream(archivo);
            oo = new ObjectOutputStream(fo);
            for (Doctores t : doctores) {
                oo.writeObject(t);
            }
            oo.flush();
        } catch (Exception e) {
        }
        try {
            oo.close();
            oo.close();
        } catch (Exception e) {
        }
    }
}
