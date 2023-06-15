/*
En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
*/

package Ejercicio11;

import java.util.Date;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        int anio, mes, dia;
        Date fecha, hoy;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el año:");
        anio = input.nextInt() - 1900;

        System.out.println("Ingrese el mes:");
        mes = input.nextInt() - 1;

        System.out.println("Ingrese el dia:");
        dia = input.nextInt();

        fecha = new Date(anio,mes,dia);
        hoy = new Date();

        System.out.println("\nLa fecha ingresada corresponde a: " + fecha);
        System.out.println("La fecha de hoy corresponde a: " + hoy);

        if (hoy.compareTo(fecha) > 0) {
            System.out.println("\nPasaron " + (hoy.getYear()-fecha.getYear()) + " años desde la fecha ingresada");
        } else {
            System.out.println("\nFaltan " + (fecha.getYear()-hoy.getYear()) + " años para la fecha ingresada");
        }
    }
}
