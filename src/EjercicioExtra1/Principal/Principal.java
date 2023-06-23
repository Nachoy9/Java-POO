/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes.
*/

package EjercicioExtra1.Principal;

import EjercicioExtra1.Entidades.Cancion;
import EjercicioExtra1.Servicios.CancionServicio;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        CancionServicio canSer = new CancionServicio();

        String titulo, autor;

        System.out.println("Ingrese el titulo de la cancion:");
        titulo = input.nextLine();

        System.out.println("Ingrese el autor de de la cancion '" + titulo + "':");
        autor = input.nextLine();

        Cancion cancion = canSer.agregarCancion(titulo,autor);

        System.out.println(cancion.toString());

    }

}
