package curso.personas;

/**
 *
 * @author ing_e
 */
public class Empleado extends Persona{
    
    String departamento;
    double sueldo;
    int diasDeVacaciones;
    
    public static void main(String... args){
        /*Empleado jorge = new Empleado("UNAM",10000,6,"Jorge",28,1.78);
        jorge.dormir();
        
        Viajero martha = new Viajero("Cuba",true,"Martha",34,1.66);
        martha.dormir();*/
        
        Persona mariana = new Empleado("Gorditas de la esquina",30000,10,"Mariana",47,1.59);
        mariana.dormir();
        
        mariana = new Viajero("Cuba",true,"Mariana",34,1.66);
        mariana.dormir();
    }
    
    private void cobrarNomina(){
        System.out.println("El empleado "+nombre+" ha cobrado su nómina de $"+sueldo);
    }
    
    protected void pedirVacaciones(){
        System.out.println("Las vacaciones han sido autorizadas para "+nombre);
    }
    
    public void dormir(){
        System.out.println("Durmiendo...");
        System.out.println("La persona "+nombre+" ha dormido 5 horas");
    }

    public Empleado(String departamento, double sueldo, int diasDeVacaciones, String nombre, int edad, double estatura) {
        super(nombre, edad, estatura);
        this.departamento = departamento;
        this.sueldo = sueldo;
        this.diasDeVacaciones = diasDeVacaciones;
    }
    
    
    
}
