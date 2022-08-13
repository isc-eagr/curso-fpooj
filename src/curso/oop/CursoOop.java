/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package curso.oop;

import java.util.Scanner;

/**
 *
 * @author ing_e
 */
public class CursoOop {
    int curso = 20; //Esto es un atributo por ser una variable que está en la clase, pero fuera de algun metodo
    double saldo;
    String mensaje = "Otro atributo";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println("Introduce tu nombre: ");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        System.out.println("El nombre introducido es: "+nombre);
        
        /*int prueba = 10;
        System.out.println("La variable vale: "+prueba);
        prueba = 15;
        System.out.println("La variable ahora vale: "+prueba);
        prueba = 30;
        System.out.println("La variable ahora vale: "+prueba);
        
        
        double pruebaDecimal = 10.47;
        System.out.println("La variable vale: "+pruebaDecimal);
        pruebaDecimal = 15.12;
        System.out.println("La variable ahora vale: "+pruebaDecimal);
        pruebaDecimal = 30.98;
        System.out.println("La variable ahora vale: "+pruebaDecimal);
        
        //Números enteros
        byte b = 127;
        short s = 16000;
        int i = 478378378;
        long l = 4578378378332892545l;
        
        //Números decimales
        float f = 37.3828f;
        double d = 464837.3828;
        
        
        //Variables de decisión
        boolean bool = true; //verdadero, 1, si
        boolean bool2 = false; //falso, 0, no
        
        //Caracter
        char c = 'a';
        char c1 = '+';
        char c2 = '?';
        
        String s1 = "Hola mundo!";
        String s2 = "Hola mundo!";
        
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(bool);
        System.out.println(c);
        System.out.println(s1);*/
        
        
        System.out.println(new CursoOop().curso);
        
    }
    
    public int prueba(String s){
        System.out.println(curso);
        return 5;
    }
    public void prueba2(){
        System.out.println(curso);
    }
    
    public void prueba3(){
        System.out.println(curso);
    }
    
    public void prueba4(){
        System.out.println(curso);
    }
    
}
