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
public class admintecnico {
     private ArrayList <tecnicos> listapersonas = new ArrayList();
    private File archivo = null;

    public admintecnico(String path) {
        archivo = new File (path);
    }

    public ArrayList<tecnicos> getListapersonas() {
        return listapersonas;
    }

    public void setListapersonas(ArrayList<tecnicos> listapersonas) {
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
    
    public void settecnicos (tecnicos p){
        this.listapersonas.add(p);
    }
    
    public void escribirArchivo() throws IOException{
        FileWriter fw=null;
        BufferedWriter bw=null;
        
        try {
            fw= new FileWriter(archivo,true);
            bw=new BufferedWriter (fw);
            for (tecnicos t : listapersonas) {
                bw.write(t.getNombre()+";");
                bw.write(t.getEdad()+";");
                bw.write(t.getGenero()+";");
                bw.write(t.getExito()+";");              
            }
            bw.flush();
        } catch (Exception e) {
        }
        
        bw.close();
        fw.close();
    }
    
    public void cargarArchivo(){
        Scanner r = null;
        listapersonas=new ArrayList();
        if (archivo.exists()) {
            try {
            r=new Scanner(archivo);
            r.useDelimiter(";");
            while (r.hasNext()) {
                listapersonas.add(new tecnicos(r.next(),
                        r.nextInt(),
                        r.next(),
                        r.nextInt()
                )
                );
                
                
            }
        } catch (Exception e) {
        }
            r.close();
        }//fin if
    }
}
