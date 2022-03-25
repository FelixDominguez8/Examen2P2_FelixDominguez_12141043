/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_felixdominguez_12141043;

import java.io.Serializable;

/**
 *
 * @author Lenovo I7
 */
public class Planeta implements Serializable{
    private int tamanio;
    private int peso;
    private String nombre;
    private int x;
    private int y;

    public Planeta() {
    }

    public Planeta(String nombre) {
        this.nombre = nombre;
    }
    
    

    public Planeta(int tamanio, int peso, String nombre, int x, int y) {
        this.tamanio = tamanio;
        this.peso = peso;
        this.nombre = nombre;
        this.x = x;
        this.y = y;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public int probabilidad(){
        return 0;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
