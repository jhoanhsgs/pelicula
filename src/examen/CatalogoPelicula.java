package examen;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jhoan
 */
public class CatalogoPelicula {
    private List<Pelicula> peliculas;
    private Scanner scanner;
    
    public CatalogoPelicula(){
        peliculas = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
    
    //Registrar
    public void RegistrarPelicula(){
        
        
        System.out.println("Ingrese el nombre de la película:");
        String nombre  = scanner.nextLine();
        
        System.out.println("Ingrese el autor de la película:");
        String autor  = scanner.nextLine();
        
        System.out.println("Ingrese la Fecha de publicacion de la película:");
        String FechaPublicacion  = scanner.nextLine();
        
        Pelicula pelicula = new Pelicula(nombre,autor,FechaPublicacion);
        peliculas.add(pelicula);
        System.out.println("La película se ha registrado correctamente.");
    }
    public void MostrarPeliculas(){
        if(peliculas.isEmpty()){
            System.out.println("No hay peliculas registradas en el catalogo");
        }else{
            System.out.println("Catalogo de peliculas");
            
            for(Pelicula pelicula:peliculas){
                System.out.println("--------------------");
                System.out.println("Nombre de la pelicula: " + pelicula.getNombre());
                System.out.println("Autor de la pelicula: " + pelicula.getAutor());
                System.out.println("Fecha de publicacion: " + pelicula.getFechaPublicacion());
                System.out.println("--------------------");
            }
        }
    }
}
