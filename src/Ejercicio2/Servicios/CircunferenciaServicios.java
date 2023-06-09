package Ejercicio2.Servicios;

import java.util.Scanner;
import Ejercicio2.Entidades.Circunferencia;

public class CircunferenciaServicios {

        public Circunferencia crearCircunferencia() {

            Scanner input = new Scanner(System.in);

            Circunferencia nuevaCfa = new Circunferencia();

            System.out.println("Ingrese el radio de la circunferencia (en cm): ");
            nuevaCfa.setRadio(input.nextDouble());

            return nuevaCfa;

        }

        public double area (Circunferencia _cfa) {

            double _area = Math.PI * Math.pow(_cfa.getRadio(), 2);

            return _area;

        }

        public double perimetro (Circunferencia _cfa) {

        double _perimetro = 2 * Math.PI * _cfa.getRadio();

        return _perimetro;

    }

}
