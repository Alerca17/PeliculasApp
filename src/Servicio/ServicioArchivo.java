package Servicio;

import Dominio.Pelicula;

import java.io.*;

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

        var archivo = new File(nombreArchivo);

        try {

            var lectura = new BufferedReader(new FileReader(archivo));
            String linea = lectura.readLine();

            System.out.println("*** Lista de Peliculas ***");

            while (linea != null) {

                Pelicula pelicula = new Pelicula(linea);
                System.out.println(pelicula);

                linea = lectura.readLine();
            }
            lectura.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }

    @Override
    public void crearPelicula(Pelicula pelicula) {

        boolean agregar = false;
        var archivo = new File(nombreArchivo);

        try {

            agregar = archivo.exists();
            var escribir = new PrintWriter(new FileWriter(archivo, agregar));

            escribir.println(pelicula);
            escribir.close();
            System.out.println("Se Agrego Al Catalogo");

        } catch (Exception e) {

            System.out.println(e);
        }

    }

    @Override
    public void buscarPelicula(Pelicula pelicula) {

        var archivo = new File(nombreArchivo);
        boolean encontrado = false;

        try {

            var lectura = new BufferedReader(new FileReader(archivo));

            String linea = lectura.readLine();

            while (linea != null) {

                if (linea.equalsIgnoreCase(pelicula.getNombre())) {

                    encontrado = true;
                    break;
                }
                linea = lectura.readLine();
            }

            if (encontrado) {

                System.out.println("La Pelicula " + pelicula.getNombre() + " Existe");

            } else {

                System.out.println("La Pelicula " + pelicula.getNombre() + " No Existe");
            }

            lectura.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}
