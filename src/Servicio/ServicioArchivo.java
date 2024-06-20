package Servicio;

import Dominio.Pelicula;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ServicioArchivo implements ServicioPeliculas {

    String nombreArchivo = "Peliculas.txt";

    public ServicioArchivo() {

        var archivo = new File(nombreArchivo);

        try {
            if (archivo.exists()) {

                System.out.println("Archivo Encontrado");

            } else {

                var guardado = new PrintWriter(new FileWriter(nombreArchivo));
                guardado.close();
                System.out.println("Se Creo El Archivo");
            }
        } catch (Exception e) {

            System.out.println(e);
        }

    }

    @Override
    public void mostrarPeliculas() {

    }

    @Override
    public void crearPelicula(Pelicula pelicula) {

    }

    @Override
    public void buscarPelicula(Pelicula pelicula) {

    }
}
