/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ramonella
 */
public class ListaPokemons {
    
    public List<Pokemon> pokemones;
    
    
    public ListaPokemons(){
        this.pokemones = new ArrayList<>();
    }
    
    public void insertar(Pokemon p){
        this.pokemones.add(p);
    }
    
    
    public int obtenerId(String nombre){
        
        Pokemon temp;
        if(nombre.trim().equalsIgnoreCase("Nidoran♀")){
            return 42;
        }else if(nombre.trim().equalsIgnoreCase("Nidoran♂")){
            return 41;
        }
        
        for (int i = 0; i < pokemones.size(); i++) {
           temp = pokemones.get(i);
           if(temp.nombre.trim().equalsIgnoreCase(nombre.trim())){
               return temp.pokedex;
           }
        }
        return -1;
    }
}
