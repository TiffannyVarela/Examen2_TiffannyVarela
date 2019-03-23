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
public class ram extends parte{
    private double tam;
    private String marca;

    public ram() {
        super();
    }

    public ram(double tam, String marca) {
        this.tam = tam;
        this.marca = marca;
    }

    public ram(double tam, String marca, int tiempo) {
        super(tiempo);
        this.tam = tam;
        this.marca = marca;
    }

    public double getTam() {
        return tam;
    }

    public void setTam(double tam) {
        this.tam = tam;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return marca;
    }
    
    
    
}
