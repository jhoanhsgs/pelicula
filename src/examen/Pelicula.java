/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author jhoan
 */
public class Pelicula {
    //Atributos
    String nombre;
    String autor;
    String FechaPublicacion;
    
    //const

    public Pelicula() {
    }
      
    
    public Pelicula(String nombre, String autor, String FechaPublicacion) {
        this.nombre = nombre;
        this.autor = autor;
        this.FechaPublicacion = FechaPublicacion;
    }
   
    //gett y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getFechaPublicacion() {
        return FechaPublicacion;
    }

    public void setFechaPublicacion(String FechaPublicacion) {
        this.FechaPublicacion = FechaPublicacion;
    }
    
}
