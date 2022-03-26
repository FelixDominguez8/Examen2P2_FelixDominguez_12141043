/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_felixdominguez_12141043;

import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author Lenovo I7
 */
public class HiloColision extends Thread{
    private JProgressBar progreso;
    private int p1;
    private int tiempo;

    public HiloColision() {
    }

    public HiloColision(JProgressBar progreso) {
        this.progreso = progreso;
    }

    public JProgressBar getProgreso() {
        return progreso;
    }

    public void setProgreso(JProgressBar progreso) {
        this.progreso = progreso;
    }

    public int getP1() {
        return p1;
    }

    public void setP1(int p1) {
        this.p1 = p1;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
    
    
    @Override
    public void run() {
        int tiempo=0;
        while(progreso.getValue()<progreso.getMaximum()){
            progreso.setValue(progreso.getValue()+1);  
            tiempo=tiempo+5;
            try {
                Thread.sleep(5);
            } catch (InterruptedException ex) {

            }
            
        }
        setTiempo(tiempo);
        System.out.println("Tiempo de colicion en milisegundos: "+tiempo);
    }
}
