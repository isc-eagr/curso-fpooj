/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.zoologico;

/**
 *
 * @author ing_e
 */
public class Zoologico {
    
    public static void main(String... args){
        Animal a;
        a = new Perro();
        a.hacerSonido();
        
        a = new Gato();
        a.hacerSonido();
        
        a = new Vaca();
        a.hacerSonido();
        
    }
    
}
