package ActividadExtra3.Servicios;

import ActividadExtra3.Entidades.Pelicula;
import java.util.Scanner;

public class PeliculaServicio {

    Scanner input = new Scanner(System.in).useDelimiter("\n");
    Pelicula pelicula = new Pelicula();

    public Pelicula crearPelicula() {

        System.out.println("\nIngrese el titulo de la pelicula:");
        pelicula.setTitulo(input.nextLine());

        System.out.println("Ingrese el genero de la pelicula:");
        pelicula.setGenero(input.nextLine());

        System.out.println("Ingrese el año de la pelicula:");
        pelicula.setAnio(input.nextInt());

        System.out.println("Ingrese la duracion (en minutos) de la pelicula:");
        pelicula.setDuracion(input.nextInt());

        return pelicula;
    }

    public String getTitulo() {
        return pelicula.getTitulo();
    }

    public String getGenero() {
        return pelicula.getGenero();
    }

    public String getInfo() {
        return pelicula.toString();
    }

}
