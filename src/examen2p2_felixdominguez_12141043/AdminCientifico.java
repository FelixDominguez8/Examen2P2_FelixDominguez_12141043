/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_felixdominguez_12141043;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Lenovo I7
 */
public class AdminCientifico {
    private ArrayList<Cientifico> listaCientificos = new ArrayList();
    private File archivo = null;
    
    public AdminCientifico(String path) {
        archivo = new File(path);
    }

    public ArrayList<Cientifico> getListaCientificos() {
        return listaCientificos;
    }

    public void setListaCientificos(ArrayList<Cientifico> listaCientificos) {
        this.listaCientificos = listaCientificos;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void setCientifico(Cientifico a){
        listaCientificos.add(a);
    }
    
    
    public void cargarArchivo() {
        try {            
            listaCientificos = new ArrayList();
            Cientifico temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Cientifico) objeto.readObject()) != null) {
                        listaCientificos.add(temp);
                    }
                } catch (EOFException e) {
                    
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Cientifico t : listaCientificos) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
