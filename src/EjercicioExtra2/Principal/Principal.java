/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
*/

package EjercicioExtra2.Principal;

import java.util.Scanner;
import EjercicioExtra2.Entidades.Punto;
import EjercicioExtra2.Servicios.PuntoServicio;

public class Principal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        PuntoServicio punSer = new PuntoServicio();

        Punto[] puntos = new Punto[2];

        double x,y;

        System.out.println("Bienvenido!");

        for (int i = 0; i < 2; i++) {

            System.out.println("\nIngrese la coordenada x del punto Nro " + (i+1));
            x = input.nextDouble();

            System.out.println("Ingrese la coordenada y del punto Nro " + (i+1));
            y = input.nextDouble();

            puntos[i] = punSer.crearPunto(x,y);
        }

        System.out.println("\nLa distancia entre los puntos ingresados es:");
        System.out.println(punSer.calcularDistancia(puntos[0],puntos[1]));
    }
}
