/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab2_tiffannyvarela;

/**
 *
 * @author tiffa
 */

import javax.swing.JProgressBar;
public class hilo_proggres extends Thread {
    private JProgressBar progBar;
    int duracion;
    int result;
    private boolean avanzar;
    private boolean vive;

    public hilo_proggres(JProgressBar progBar, int duracion) {
        this.progBar = progBar;
        this.duracion = duracion;
        this.result = duracion*1000;
        this.avanzar = true;
        this.vive = true;
    }

    public JProgressBar getProgBar() {
        return progBar;
    }

    public void setProgBar(JProgressBar progBar) {
        this.progBar = progBar;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
    
    @Override
    public void run(){
        progBar.setValue(0);
        int temp=0;
        while (vive) {
            if (avanzar) {
                progBar.setValue(progBar.getValue()+1000);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
    }
    
    
}
