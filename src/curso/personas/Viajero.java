package curso.personas;

/**
 *
 * @author ing_e
 */
public class Viajero extends Persona{
    
    String ultimoPaisVisitado;
    boolean pasaporteVigente;
    
    void viajar(String pais){
        System.out.println("El viajero está tomando un viaje a "+pais);
        ultimoPaisVisitado = pais;
    }
    
    void renovarPasaporte(){
        pasaporteVigente = true;
        System.out.println("El viajero renovó su pasaporte");
    }

    public Viajero(String ultimoPaisVisitado, boolean pasaporteVigente, String nombre, int edad, double estatura) {
        super(nombre, edad, estatura);
        this.ultimoPaisVisitado = ultimoPaisVisitado;
        this.pasaporteVigente = pasaporteVigente;
    }
    
    public static void main(String... args){

        Empleado mariana = new Empleado("Gorditas de la esquina",30000,10,"Mariana",47,1.59);
        mariana.sueldo = 40000;
        System.out.println(mariana.sueldo);

    }
    
}
