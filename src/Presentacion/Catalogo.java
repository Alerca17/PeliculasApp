package Presentacion;

import Dominio.Pelicula;
import Servicio.ServicioArchivo;
import Servicio.ServicioPeliculas;
import Servicio.Servicios;
import java.util.Scanner;

public class Catalogo {

    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

        ServicioPeliculas servicios = new ServicioArchivo();
        menuPrincipal(servicios);
    }

    private static void menuPrincipal(ServicioPeliculas servicios) {

        int opc;

        System.out.print("""
                *** Catalogo Peliculas ***
                                
                1).Agregar Peliculas
                2).Mostrar Peliculas
                3).Buscar Peliculas
                4).Salir 
                """);
        System.out.print("Ingrese La Opcion: ");
        opc = leer.nextInt();
        leer.nextLine();
        System.out.println(" ");

        switch (opc) {

            case 1:
                System.out.print("Ingrese El Titulo De La Pelicula: ");
                String nombre = leer.nextLine();
                servicios.crearPelicula(new Pelicula(nombre));
                System.out.println(" ");
                menuPrincipal(servicios);
                break;

            case 2:
                servicios.mostrarPeliculas();
                System.out.println(" ");
                menuPrincipal(servicios);
                break;

            case 3:
                System.out.print("Introduce El Nombre De La Pelicula: ");
                String buscar = leer.nextLine();
                servicios.buscarPelicula(new Pelicula(buscar));
                System.out.println(" ");
                menuPrincipal(servicios);
                break;

            case 4:
                System.exit(0);
                break;

            default:
                System.out.println("Opcion No Valida");
                menuPrincipal(servicios);
        }
    }
}