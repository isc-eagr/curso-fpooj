/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package curso.operadores;

/**
 *
 * @author ing_e
 */
public class Operadores {
    
    public static void main(String... args){
        /*int x = 6;
        int y = 3;
        
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);
        
        System.out.println(8/2);
        
        x++;
        y--;
        
        System.out.println(x);
        System.out.println(y);*/
        
        System.out.println(new Operadores().multiplicar(9,10));
        System.out.println(new Operadores().multiplicar(5.66,9.89));

    }
    
    int multiplicar(int x, int y){
        return x*y;
    }
    
    double multiplicar(double x, double y){
        return x*y;
    }
    
}
