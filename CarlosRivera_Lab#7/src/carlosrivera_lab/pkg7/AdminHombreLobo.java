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
public class AdminHombreLobo {

    ArrayList<Hombre_Lobo> listalobo = new ArrayList();
    File archivo = null;

    public AdminHombreLobo(String path) {
        archivo = new File(path);
    }

    public ArrayList<Hombre_Lobo> getListalobo() {
        return listalobo;
    }

    public void setListalobo(ArrayList<Hombre_Lobo> listalobo) {
        this.listalobo = listalobo;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "AdminHombreLobo{" + "listalobo=" + listalobo + '}';
    }
    public void setHombreLobo(Hombre_Lobo hl){
        this.listalobo.add(hl);
    }
    
     public void cargarArchivo() {
        try {
            listalobo = new ArrayList();
            Hombre_Lobo temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Hombre_Lobo) objeto.readObject()) != null) {
                        listalobo.add(temp);
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
            for (Hombre_Lobo t : listalobo) {
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
