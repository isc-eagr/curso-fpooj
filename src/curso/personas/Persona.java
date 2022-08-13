package curso.personas;

/**
 *
 * @author ing_e
 */
public class Persona {
    
    String nombre;
    int edad;
    double estatura;
    
    void comer(){
        System.out.println("Comiendo...");
        System.out.println("La persona ha comido");
    }
    
    void dormir(){
        System.out.println("Durmiendo...");
        System.out.println("La persona "+nombre+" ha dormido 8 horas");
    }
    
    void comer(String comida){
        System.out.println("Comiendo "+comida+"...");
        System.out.println("La persona ha comido "+comida);
    }
    
    public static void main(String... args){
        Persona jorge = new Persona("Jorge",28,1.76);
        jorge.dormir();
    }

    public Persona(String nombre, int edad, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }
    
    
    
}
