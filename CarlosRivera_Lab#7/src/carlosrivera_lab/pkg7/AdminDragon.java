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
public class AdminDragon {

    ArrayList<Dragón> listadragon = new ArrayList();
    File archivo = null;

    public AdminDragon(String path) {
        archivo = new File(path);
    }

    public ArrayList<Dragón> getListadragon() {
        return listadragon;
    }

    public void setListadragon(ArrayList<Dragón> listadragon) {
        this.listadragon = listadragon;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "AdminDragon{" + "listadragon=" + listadragon + '}';
    }

    public void setDragon(Dragón d) {
        this.listadragon.add(d);
    }

    public void cargarArchivo() {
        try {
            listadragon = new ArrayList();
            Dragón temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Dragón) objeto.readObject()) != null) {
                        listadragon.add(temp);
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
            for (Dragón t : listadragon) {
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
