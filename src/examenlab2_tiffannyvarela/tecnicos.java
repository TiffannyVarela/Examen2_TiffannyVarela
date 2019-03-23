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
public class tecnicos {
    private String nombre;
    private int edad;
    private String genero;
    private int exito;

    public tecnicos() {
    }

    public tecnicos(String nombre, int edad, String genero, int exito) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.exito = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getExito() {
        return exito;
    }

    public void setExito(int exito) {
        this.exito = exito;
    }

    @Override
    public String toString() {
        return nombre ;
    }
    
    
}
