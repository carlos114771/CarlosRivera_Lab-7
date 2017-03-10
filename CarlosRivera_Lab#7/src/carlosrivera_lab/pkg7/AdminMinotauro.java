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
public class AdminMinotauro {

    ArrayList<Minotauro> listaminotauro = new ArrayList();
    File archivo = null;

    public AdminMinotauro(String path) {
        archivo = new File(path);
    }

    public ArrayList<Minotauro> getListaminotauro() {
        return listaminotauro;
    }

    public void setListaminotauro(ArrayList<Minotauro> listaminotauro) {
        this.listaminotauro = listaminotauro;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "AdminMinotauro{" + "listaminotauro=" + listaminotauro + '}';
    }
    public void setMinotauro(Minotauro m){
        this.listaminotauro.add(m);
    }
     public void cargarArchivo() {
        try {
            listaminotauro = new ArrayList();
            Minotauro temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Minotauro) objeto.readObject()) != null) {
                        listaminotauro.add(temp);
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
            for (Minotauro t : listaminotauro) {
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
