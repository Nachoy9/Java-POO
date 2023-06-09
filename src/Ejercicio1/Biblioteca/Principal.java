/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
*/

package Ejercicio1.Biblioteca;

import Ejercicio1.Entidades.Libro;
import Ejercicio1.Servicios.LibroServicio;

public class Principal {

    public static void main(String[] args) {

        LibroServicio libroServicio = new LibroServicio();

        Libro primerLibro = libroServicio.altaLibro();

        libroServicio.verLibro(primerLibro);

    }
}
