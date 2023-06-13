/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
*/

package Ejercicio2.Principal;

import Ejercicio2.Entidades.Circunferencia;
import Ejercicio2.Servicios.CircunferenciaServicios;

public class Principal {

    public static void main(String[] args) {

        CircunferenciaServicios cfaServicio = new CircunferenciaServicios();

        Circunferencia cfaNueva = cfaServicio.crearCircunferencia();

        double area = cfaServicio.area(cfaNueva);
        double perimetro = cfaServicio.perimetro(cfaNueva);

        System.out.println("El area de la circunferencia es: " + area + " cm2");
        System.out.println("El perimetro de la circunferencia es: " + perimetro + " cm");

    }

}
