/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

import java.io.IOException;

/**
 *
 * @author Ramonella
 */
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
      // rutas();
       movimientos2();
   
    }
    
    
    public static  void rutas() throws IOException {
         Lector lecto = new Lector();
        ListaPokemons p = lecto.Leer_Archivo("C://Users//Ramonella//Desktop//pokemon.txt");
        System.out.println(p.pokemones.size());
        GenerarArchivoUbicacion h = new GenerarArchivoUbicacion(p);
        h.comparar();
    }
    
    
       public static void movimientos() throws IOException{
        Lector lecto = new Lector();
        ListaPokemons p = lecto.Leer_Archivo("C://Users//Ramonella//Desktop//moves.txt");
        System.out.println(p.pokemones.size());
        GenerarArchivoUbicacion h = new GenerarArchivoUbicacion(p);
        h.comparar2();
    }
       
     public static void movimientos2() throws IOException{
        Lector lecto = new Lector();
        ListaPokemons p = lecto.Leer_Archivo("C://Users//Ramonella//Desktop//pokemon2Id.txt");
        System.out.println(p.pokemones.size()); 
        System.out.println(p.pokemones.size());
        GenerarArchivoUbicacion h = new GenerarArchivoUbicacion(p);
        h.comparar3();
        
     }  
       
    
}
