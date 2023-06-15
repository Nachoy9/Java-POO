/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
* Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
* Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
* Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
* Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
*/

package Ejercicio12.Principal;

import java.util.Scanner;
import Ejercicio12.Entidades.Persona;
import Ejercicio12.Servicios.PersonaServicio;

public class Principal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        PersonaServicio perSer = new PersonaServicio();

        Persona persona = perSer.crearPersona();

        int edad;

        if (perSer.calcularEdad(persona) == -1) {
            System.out.println("\nLa persona ingresada todavia no ha nacido. Fin de la ejecucion.");
            return;
        } else {
            System.out.println("\n" + perSer.mostrarNombre(persona) + " tiene " + perSer.calcularEdad(persona) + " años.");
        }

        System.out.println("\nIngrese una edad para ver si " + perSer.mostrarNombre(persona) + " es mayor o menor:");
        edad = input.nextInt();

        if (perSer.menorQue(persona,edad)) {
            System.out.println("\n" + perSer.mostrarNombre(persona) + " tiene menos de " + edad + " años.");
        } else {
            System.out.println("\n" + perSer.mostrarNombre(persona) + " tiene mas de " + edad + " años.");
        }

        System.out.println("\nLa informacion completa de la persona ingresada es:");
        System.out.println(perSer.mostrarPersona(persona));
    }
}
