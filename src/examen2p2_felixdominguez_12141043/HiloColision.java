/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_felixdominguez_12141043;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author Lenovo I7
 */
public class HiloColision extends Thread{
    private JProgressBar progreso;
    private int p1;

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
    
    @Override
    public void run() {
        while(progreso.getValue()<progreso.getMaximum()){
            progreso.setValue(progreso.getValue()+5);  
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {

            }
        }
        if(p1==2){
            JOptionPane.showMessageDialog(null,"Se ha creado un nuevo planeta durante la colision");
        }else {
            JOptionPane.showMessageDialog(null, "Foca voladora");
        }
        Principal a;
    }
}
