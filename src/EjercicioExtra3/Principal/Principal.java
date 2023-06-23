/*
Crear clase llamada Ecuacion, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:
* Método calcDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
* Método cantRaices(): devuelve un int en funcion de la cantidad de raices que tiene, devuelve 3 si las raices son imaginarias.
* Método obtenerRaices(): llama a cantRaices() y dependiendo del resultado devuelto calcula las raices.
* Método calcular(): esté método llamará a obtenerRaices() mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación usando el metodo
obtenerRaices().
*/

package EjercicioExtra3.Principal;

import java.util.Scanner;
import EjercicioExtra3.Entidades.Ecuacion;
import EjercicioExtra3.Servicios.ServicioEcuacion;

public class Principal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ServicioEcuacion serEc = new ServicioEcuacion();

        double a, b, c;

        System.out.println("Ingrese el coeficiente 'a' de la ecuacion:");
        a = input.nextDouble();

        System.out.println("Ingrese el coeficiente 'b' de la ecuacion:");
        b = input.nextDouble();

        System.out.println("Ingrese el coeficiente 'c' de la ecuacion:");
        c = input.nextDouble();

        Ecuacion ecuacion = serEc.crearEcuacion(a,b,c);

        System.out.println("\nLa ecuacion ingresada es " + ecuacion.toString() +"\n");

        serEc.calcular(ecuacion);

    }
}
