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
public class AdminGuerreros {

    ArrayList<Guerreros> listaguerrero = new ArrayList();
    File archivo = null;

    public AdminGuerreros(String path) {
        archivo = new File(path);
    }

    public ArrayList<Guerreros> getListaguerro() {
        return listaguerrero;
    }

    public void setListaguerro(ArrayList<Guerreros> listaguerrero) {
        this.listaguerrero = listaguerrero;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "AdminGuerreros{" + "listaguerrero=" + listaguerrero + '}';
    }
    public void setGuerrero(Guerreros g){
        this.listaguerrero.add(g);
    }
 public void cargarArchivo() {
        try {
            listaguerrero = new ArrayList();
            Guerreros temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Guerreros) objeto.readObject()) != null) {
                        listaguerrero.add(temp);
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
            for (Guerreros t : listaguerrero) {
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
