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
public class bateria extends parte{
    private int horas;
    private String material;

    public bateria() {
    }

    public bateria(int horas, String material) {
        this.horas = horas;
        this.material = material;
    }

    public bateria(int horas, String material, int tiempo) {
        super(tiempo);
        this.horas = horas;
        this.material = material;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return material;
    }
    
    
}
