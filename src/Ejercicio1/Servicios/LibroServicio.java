package Ejercicio1.Servicios;

import Ejercicio1.Entidades.Libro;
import java.util.Scanner;
public class LibroServicio {

    public Libro altaLibro() {

        Scanner input = new Scanner(System.in);

        Libro nuevoLibro = new Libro();

        System.out.println("Ingrese el ISBN del libro:");
        nuevoLibro.setIsbn(input.nextLine());

        System.out.println("Ingrese el titulo del libro:");
        nuevoLibro.setTitulo(input.nextLine());

        System.out.println("Ingrese el autor del libro:");
        nuevoLibro.setAutor(input.nextLine());

        System.out.println("Ingrese la cantidad de paginas del libro:");
        nuevoLibro.setPaginas(input.nextInt());

        return nuevoLibro;

    }

    public void verLibro(Libro _libro) {

        System.out.println("El ISBN del libro es " + _libro.getIsbn());

        System.out.println("El titulo del libro es " + _libro.getTitulo());

        System.out.println("El autor del libro es " + _libro.getAutor());

        System.out.println("La cantidad de paginas del libro es " + _libro.getPaginas());

    }

}