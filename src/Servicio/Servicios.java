package Servicio;

import Dominio.Pelicula;
import java.util.ArrayList;

public class Servicios implements ServicioPeliculas {

    ArrayList<Pelicula> peliculas = new ArrayList<>();

    @Override
    public void mostrarPeliculas() {

        System.out.println("*** Listado de peliculas ***");
        System.out.println(" ");
        peliculas.forEach(System.out::println);
    }

    @Override
    public void crearPelicula(Pelicula pelicula) {

        peliculas.add(pelicula);
        System.out.println("Pelicula Creada Con Exito");

    }

    @Override
    public void buscarPelicula(Pelicula pelicula) {

        int index = peliculas.indexOf(pelicula);

        if (index != -1) {

            System.out.println("Pelicula Encontrada En La Linea " + index);

        } else {

            System.out.println("Pelicula No Encontrada");
        }
    }
}
