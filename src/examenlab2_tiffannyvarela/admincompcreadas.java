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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class admincompcreadas {
    private ArrayList <computadora> listapersonas = new ArrayList();
    private File archivo = null;

    public admincompcreadas(String path) {
        archivo = new File (path);
    }

    public ArrayList<computadora> getListapersonas() {
        return listapersonas;
    }

    public void setListapersonas(ArrayList<computadora> listapersonas) {
        this.listapersonas = listapersonas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listapersonas=" + listapersonas;
    }
    
    public void setcomputadora (computadora p){
        this.listapersonas.add(p);
    }
    
    public void escribirArchivo() throws IOException{
        FileWriter fw=null;
        BufferedWriter bw=null;
        
        try {
            fw= new FileWriter(archivo,true);
            bw=new BufferedWriter (fw);
            for (computadora t : listapersonas) {
                bw.write(t.getNum_serie()+";");
                bw.write(t.getAnio()+";");
                bw.write(t.getColor()+";");
                bw.write(t.getMaterial()+";");
                bw.write(t.getRamm()+";");
                bw.write(t.getDisco_duro()+";");
                bw.write(t.getBatteria()+";");
                bw.write(t.getBoard()+";");
                bw.write(t.getPant()+";");
                bw.write(t.getProces()+";");                
            }
            bw.flush();
        } catch (Exception e) {
        }
        
        bw.close();
        fw.close();
    }
    
    public void cargarArchivo(){
        computadora c = new computadora();
        Scanner r = null;
        listapersonas=new ArrayList();
        if (archivo.exists()) {
            try {
            r=new Scanner(archivo);
            r.useDelimiter(";");
            while (r.hasNext()) {
                listapersonas.add(new computadora(c.getNum_serie(), 
                        c.getAnio(), 
                        c.getMaterial(), 
                        c.getRamm(), 
                        c.getDisco_duro(), 
                        c.getBatteria(), 
                        c.getBoard(), 
                        c.getPant(), 
                        c.getProces())
                        
                );
                
                
            }
        } catch (Exception e) {
        }
            r.close();
        }//fin if
    }
}
