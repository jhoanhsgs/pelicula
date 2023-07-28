/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author jhoan
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       CatalogoPelicula Cpelicula = new CatalogoPelicula();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Catálogo de Películas");
            System.out.println("");
            System.out.println("1. Registrar película");
            System.out.println("2. Mostrar películas");
            System.out.println("0. Salir");
            System.out.println("Ingrese una opción:");

            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    //System.out.println("esta es la opcion 1");
                    Cpelicula.RegistrarPelicula();
                    break;
                case 2:
                    //System.out.println("esta es la opcion 2");
                    Cpelicula.MostrarPeliculas();

                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

            System.out.println();
        } while (opcion != 0);
    }
    
    
}
