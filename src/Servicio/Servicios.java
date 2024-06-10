package Servicio;

import Dominio.Pelicula;
import java.util.ArrayList;

public class Servicios implements ServicioPeliculas{

    ArrayList<Pelicula> peliculas = new ArrayList<>();

    @Override
    public void mostrarPeliculas() {

        System.out.print("*** Listado de peliculas ***");
        peliculas.forEach(System.out::println);
    }

    @Override
    public void crearPelicula(Pelicula pelicula) {

        peliculas.add(pelicula);
        System.out.println("Pelicula Creada Con Exito");

    }

    @Override
    public void buscarPelicula(Pelicula pelicula) {

        boolean encontrado = false;
        int index = 0;

        for (Pelicula p : peliculas) {

            if (p.getNombre().equals(pelicula.getNombre())) {

                encontrado = true;
                index = peliculas.indexOf(pelicula);
                break;
            }
        }

        if (encontrado) {

            System.out.println("Pelicula Encontrada En La Linea " + index);

        } else {

            System.out.println("Pelicula No Encontrada");
        }
    }
}
