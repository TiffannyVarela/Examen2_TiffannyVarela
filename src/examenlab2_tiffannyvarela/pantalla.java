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
public class pantalla extends parte{
    private String tactil;
    private String tipo;

    public pantalla() {
    }

    public pantalla(String tactil, String tipo) {
        this.tactil = tactil;
        this.tipo = tipo;
    }

    public pantalla(String tactil, String tipo, int tiempo) {
        super(tiempo);
        this.tactil = tactil;
        this.tipo = tipo;
    }

    public String getTactil() {
        return tactil;
    }

    public void setTactil(String tactil) {
        this.tactil = tactil;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return tipo;
    }
    
    
}
