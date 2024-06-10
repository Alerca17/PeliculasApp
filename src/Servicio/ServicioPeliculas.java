package Servicio;

import Dominio.Pelicula;

public interface ServicioPeliculas {

    public void mostrarPeliculas();
    public void crearPelicula(Pelicula pelicula);
    public void buscarPelicula(Pelicula pelicula);
}
