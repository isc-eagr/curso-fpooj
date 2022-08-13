package curso.streaming;

/**
 *
 * @author ing_e
 */
public class Pelicula {
    
    String nombre;
    int anio;
    String genero;
    int clasificacion;
    
    void reproducirPelicula(){
        System.out.println("Reproduciendo pelicula "+nombre);
    }
    
    void reproducirPelicula(String nombre){
        System.out.println("Reproduciendo pelicula "+nombre);
    }
    
    void reproducirPelicula(int nombre){
        System.out.println("Reproduciendo pelicula "+nombre);
    }
    
    void pausarPelicula(){
        System.out.println("La pelicula "+nombre+" se ha pausado");
    }
    
    void clasificarPelicula(int calificacion){
        int clasificacion = calificacion;
        System.out.println("La pelicula se ha calificado con: "+calificacion);
    }
    

    
    public static void main(String...args){
        /*Pelicula pelicula1 = new Pelicula();
        pelicula1.anio = 2022;
        pelicula1.clasificacion = 2;
        pelicula1.genero = "Acción";
        pelicula1.nombre = "Avengers";*/
        
        Pelicula pelicula1 = new Pelicula("El señor de los anillos", 2000, "Fantasía",3);
        Pelicula pelicula2 = new Pelicula("Avengers", 2022, "Acción",4);
        
        pelicula1.reproducirPelicula();
        pelicula1.pausarPelicula();
        pelicula1.clasificarPelicula(2);
        
        pelicula2.reproducirPelicula();
        pelicula2.pausarPelicula();
        
        
        
        
    }
    
    Pelicula(String nombre, int anio, String genero, int clasificacion){
        this.nombre = nombre;
        this.anio = anio;
        this.genero = genero;
        this.clasificacion = clasificacion;
    }
    
}

