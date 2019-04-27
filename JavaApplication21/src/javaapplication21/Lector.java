/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Ramonella
 */
public class Lector {
    
      public ListaPokemons Leer_Archivo(String ruta) {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
         ListaPokemons listaP = new ListaPokemons();
        try {
            archivo = new File(ruta);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            // Lectura del fichero

            String linea;
            String valores[];
            Pokemon nuevo;
           
            while ((linea = br.readLine()) != null) {
                valores = linea.split(",");
                nuevo = new Pokemon(Integer.parseInt(valores[0]), valores[1]);
                listaP.insertar(nuevo);
                
            }
        } catch (Exception e) {
            System.out.println("NO se pudo abiri el archivo" + e);
        }
        return listaP;
    }
    
}
