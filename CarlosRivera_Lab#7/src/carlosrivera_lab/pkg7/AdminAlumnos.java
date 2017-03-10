/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosrivera_lab.pkg7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Usuario Dell
 */
public class AdminAlumnos {
    ArrayList<Alumno> listaalumnos = new ArrayList();
    File archivo = null;

    public AdminAlumnos(String path) {
        archivo = new File(path);
    }

    public ArrayList<Alumno> getListaalumnos() {
        return listaalumnos;
    }

    public void setListaalumnos(ArrayList<Alumno> listaalumnos) {
        this.listaalumnos = listaalumnos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "Lista" +listaalumnos;
    }
    
    public void setAlumno(Alumno a){
        this.listaalumnos.add(a);
    }
     public void cargarArchivo() {
        try {
            listaalumnos = new ArrayList();
            Alumno temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Alumno) objeto.readObject()) != null) {
                        listaalumnos.add(temp);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Alumno t : listaalumnos) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }

    
    
    
}
