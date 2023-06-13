/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */

package Ejercicio3.Principal;

import Ejercicio3.Entidades.Operacion;
import Ejercicio3.Servicios.OperacionServicio;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean salir = false;
        int opc;

        System.out.println("Bienvenido a su calculadora:\n");

        OperacionServicio opServ = new OperacionServicio();

        Operacion op = opServ.crearOperacion();

        while (!salir) {

            System.out.println("\nMenu principal:");
            System.out.println("\nNum1 = " + opServ.getNum1(op) + ", Num2 = " + opServ.getNum2(op) + "\n");
            System.out.println("1. Sumar Num1 + Num2.");
            System.out.println("2. Restar Num1 - Num2-");
            System.out.println("3. Multiplicar Num1 * Num2-");
            System.out.println("4. Dividir Num1 / Num2.");
            System.out.println("5. Reingresar numeros.");
            System.out.println("6. Salir.\n");

            System.out.println("Ingrese opcion:");
            opc = input.nextInt();

            switch (opc) {
                case 1:

                    System.out.println("\nNum1 + Num2 = " + opServ.suma(op) + "\n");
                    break;

                case 2:

                    System.out.println("\nNum1 - Num2 = " + opServ.resta(op) + "\n");
                    break;

                case 3:

                    if (opServ.multiplicacion(op) == 0) {
                        System.out.println("\nCuidado, uno de los numeros es 0. Num1 + Num2 = " + opServ.multiplicacion(op) + "\n");
                    } else {
                        System.out.println("\nNum1 * Num2 = " + opServ.multiplicacion(op) + "\n");
                    }
                    break;

                case 4:

                    if (opServ.division(op) == 0) {
                        System.out.println("\nError, uno de los numeros es 0\n");
                    } else {
                        System.out.println("\nNum1 / Num2 = " + opServ.division(op) + "\n");
                    }
                    break;

                case 5:

                    System.out.println("\nIngrese el primer numero:");
                    opServ.setNum1(op,input.nextDouble());

                    System.out.println("Ingrese el segundo numero:");
                    opServ.setNum2(op,input.nextDouble());

                    break;

                case 6:

                    System.out.println("\nCerrando calculadora...\n");
                    salir = true;
                    break;

                default:
                    break;
            }
        }
    }
}
