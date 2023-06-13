/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
* Constructor predeterminado o vacío
* Constructor con la capacidad máxima y la cantidad actual
* Métodos getters y setters.
* Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
* Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
* Método vaciarCafetera(): pone la cantidad de café actual en cero.
* Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
*/

package Ejercicio6.Principal;

import java.util.Scanner;

import Ejercicio6.Entidades.Cafetera;
import Ejercicio6.Servicios.CafeteraServicio;

public class Principal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean salir = false;
        int opc;

        System.out.println("Bienvenido:");

        CafeteraServicio cServ = new CafeteraServicio();

        Cafetera cafetera = cServ.crearCafetera();

        while (!salir) {

            System.out.println("\nMenu principal:");
            System.out.println("\nCapacidad Actual: " + cServ.getCA(cafetera) + "/" + cServ.getCM(cafetera) + " gr\n");
            System.out.println("1. Servir taza.");
            System.out.println("2. Agregar cafe.");
            System.out.println("3. Llenar cafetera.");
            System.out.println("4. Vaciar cafetera.");
            System.out.println("5. Salir.\n");

            System.out.println("Ingrese opcion:");
            opc = input.nextInt();

            switch (opc) {
                case 1:

                    System.out.println("\nIngrese cantidad a servir (en gr):");
                    cServ.servirTaza(cafetera,input.nextDouble());
                    break;

                case 2:

                    System.out.println("\nIngrese cantidad de cafe a agregar (en gr):");
                    cServ.agregarCafe(cafetera,input.nextDouble());
                    break;

                case 3:

                    cServ.llenarCafetera(cafetera);
                    break;

                case 4:

                    cServ.vaciarCafetera(cafetera);
                    break;

                case 5:

                    System.out.println("\nApagando cafetera...\n");
                    salir = true;
                    break;

                default:
                    break;
            }
        }
    }
}
