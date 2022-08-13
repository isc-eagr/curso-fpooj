/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.abstracta;

/**
 *
 * @author ing_e
 */
public class Pato extends Animal{
    
    public void hacerSonido(){
        System.out.println("Cuac");
    }
    
    public static void main(String... args){
        Animal a = new Pato();
        
        Pato p = new Pato();
        
        a.comer();
        a.hacerSonido();
        
        double numero = 20 * 0.04;
        
        String s1 = "Hola";
        String s2 = "Hola";
        s1.equals(s2);
        
        if(s1.equals(s2)){}
                
        int i1 =3;
        int i2 =3;
        
        
    }
    
}
