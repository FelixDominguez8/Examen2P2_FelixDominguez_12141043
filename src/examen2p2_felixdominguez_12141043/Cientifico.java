/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_felixdominguez_12141043;

import java.util.ArrayList;

/**
 *
 * @author Lenovo I7
 */
public class Cientifico {
    private String nombre;
    private ArrayList<Planeta> planetas=new ArrayList();

    public Cientifico(String nombre, ArrayList<Planeta> planetas) {
        this.nombre = nombre;
        this.planetas = planetas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Planeta> getPlanetas() {
        return planetas;
    }

    public void setPlanetas(ArrayList<Planeta> planetas) {
        this.planetas = planetas;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", planetas=" + planetas;
    }
    
}
