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
public class orden {
    private computadora comp;
    private tecnicos tec;
    private String nom_comp;
    private String nom_tecnico;
    public orden() {
        
    }

    public orden(computadora comp, tecnicos tec, String nom_comp, String nom_tecnico) {
        this.comp = comp;
        this.tec = tec;
        this.nom_comp = nom_comp;
        this.nom_tecnico = nom_tecnico;
    }

    public orden(computadora comp, tecnicos tec) {
        this.comp = comp;
        this.tec = tec;
    }

    public orden(String nom_comp, String nom_tecnico) {
        this.nom_comp = nom_comp;
        this.nom_tecnico = nom_tecnico;
    }
    
    

    public String getNom_comp() {
        return nom_comp;
    }

    public void setNom_comp(String nom_comp) {
        this.nom_comp = nom_comp;
    }

    public String getNom_tecnico() {
        return nom_tecnico;
    }

    public void setNom_tecnico(String nom_tecnico) {
        this.nom_tecnico = nom_tecnico;
    }

    
    public computadora getComp() {
        return comp;
    }

    public void setComp(computadora comp) {
        this.comp = comp;
    }

    public tecnicos getTec() {
        return tec;
    }

    public void setTec(tecnicos tec) {
        this.tec = tec;
    }

    @Override
    public String toString() {
        return "orden{" + "comp=" + comp + ", tec=" + tec + '}';
    }
    
    
}
