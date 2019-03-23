/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab2_tiffannyvarela;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tiffa
 */
public class admincomputadoras {
    private ArrayList <orden> computadoras = new ArrayList();
    private File archivo = null;

    public admincomputadoras(String path) {
        archivo = new File (path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<orden> getComputadoras() {
        return computadoras;
    }

    public void setComputadoras(ArrayList<orden> computadoras) {
        this.computadoras = computadoras;
    }
    
    public void addLista (orden o){
        this.computadoras.add(o);
    }

    @Override
    public String toString() {
        return "admincomputadoras{" + "computadoras=" + computadoras + ", archivo=" + archivo + '}';
    }
    
    
     public void escribirArchivo() throws IOException{
        FileWriter fw=null;
        BufferedWriter bw=null;
        
        try {
            fw= new FileWriter(archivo,true);
            bw=new BufferedWriter (fw);
            for (orden t : computadoras) {
                bw.write(t.getComp()+";");
                bw.write(t.getTec()+";");
            }
            bw.flush();
        } catch (Exception e) {
        }
        
        bw.close();
        fw.close();
    }
    
    public void cargarArchivo() throws IOException{
        Scanner r = null;
        computadoras=new ArrayList();
        int c=0;
        if (archivo.exists()) {
            try {
            r=new Scanner(archivo);
            r.useDelimiter(";");
            while (r.hasNext()) {
                computadoras.add(new orden(r.next(),
                        r.next()
                )
                );
                
            }
        } catch (Exception e) {
        }
            r.close();
        }//fin if


    }
}
