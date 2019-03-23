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
public class procesador extends parte{
    private int num_nucleos;
    private int velocidad;

    public procesador() {
        super();
    }

    public procesador(int num_nucleos, int velocidad) {
        this.num_nucleos = num_nucleos;
        this.velocidad = velocidad;
    }

    public procesador(int num_nucleos, int velocidad, int tiempo) {
        super(tiempo);
        this.num_nucleos = num_nucleos;
        this.velocidad = velocidad;
    }

    

    public int getNum_nucleos() {
        return num_nucleos;
    }

    public void setNum_nucleos(int num_nucleos) {
        this.num_nucleos = num_nucleos;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return Integer.toString(num_nucleos);
    }
    
    
    
}
