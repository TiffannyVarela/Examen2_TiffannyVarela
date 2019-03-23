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
public class computadora {
    private int num_serie;
    private int anio;
    private String color;
    private String material;
    private ram ramm;
    private disco disco_duro;
    private bateria batteria;
    private teclado board;
    private pantalla pant;
    private procesador proces;

    public computadora() {
    }

    public computadora(int num_serie, int anio, String color, String material, ram ramm, disco disco_duro, bateria batteria, teclado board, pantalla pant, procesador proces) {
        this.num_serie = num_serie;
        this.anio = anio;
        this.color = color;
        this.material = material;
        this.ramm = ramm;
        this.disco_duro = disco_duro;
        this.batteria = batteria;
        this.board = board;
        this.pant = pant;
        this.proces = proces;
    }

    public computadora(int num_serie, int anio, String material, ram ramm, disco disco_duro, bateria batteria, teclado board, pantalla pant, procesador proces) {
        this.num_serie = num_serie;
        this.anio = anio;
        this.material = material;
        this.ramm = ramm;
        this.disco_duro = disco_duro;
        this.batteria = batteria;
        this.board = board;
        this.pant = pant;
        this.proces = proces;
    }
    
    

    public int getNum_serie() {
        return num_serie;
    }

    public void setNum_serie(int num_serie) {
        this.num_serie = num_serie;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setString(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public ram getRamm() {
        return ramm;
    }

    public void setRamm(ram ramm) {
        this.ramm = ramm;
    }

    public disco getDisco_duro() {
        return disco_duro;
    }

    public void setDisco_duro(disco disco_duro) {
        this.disco_duro = disco_duro;
    }

    public bateria getBatteria() {
        return batteria;
    }

    public void setBatteria(bateria batteria) {
        this.batteria = batteria;
    }

    public teclado getBoard() {
        return board;
    }

    public void setBoard(teclado board) {
        this.board = board;
    }

    public pantalla getPant() {
        return pant;
    }

    public void setPant(pantalla pant) {
        this.pant = pant;
    }

    public procesador getProces() {
        return proces;
    }

    public void setProces(procesador proces) {
        this.proces = proces;
    }

    @Override
    public String toString() {
        return Integer.toString(num_serie);
    }
    
    
}
