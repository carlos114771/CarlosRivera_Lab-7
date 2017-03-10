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
public class AdminFenix {

    ArrayList<Fénix> listafenix = new ArrayList();
    File archivo = null;

    public AdminFenix(String path) {
        archivo = new File(path);
    }

    public ArrayList<Fénix> getListafenis() {
        return listafenix;
    }

    public void setListafenis(ArrayList<Fénix> listafenix) {
        this.listafenix = listafenix;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "AdminFenix{" + "listafenix=" + listafenix + '}';
    }

    public void SetFenix(Fénix f) {
        this.listafenix.add(f);
    }

    public void cargarArchivo() {
        try {
            listafenix = new ArrayList();
            Fénix temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Fénix) objeto.readObject()) != null) {
                        listafenix.add(temp);
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
            for (Fénix t : listafenix) {
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
