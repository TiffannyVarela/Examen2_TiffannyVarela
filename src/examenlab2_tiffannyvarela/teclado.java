/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab2_tiffannyvarela;
import java.awt.Color;
/**
 *
 * @author tiffa
 */
public class teclado extends parte{
    private String material;
    private Color color;

    public teclado() {
    }

    public teclado(String material, Color color) {
        this.material = material;
        this.color = color;
    }

    public teclado(String material, Color color, int tiempo) {
        super(tiempo);
        this.material = material;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return material;
    }
    
    
}
