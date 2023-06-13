package Ejercicio4.Servicios;

import Ejercicio4.Entidades.Rectangulo;

import java.util.Scanner;

public class RectanguloServicio {

    public Rectangulo crearRectangulo() {

        Scanner input = new Scanner(System.in);

        double base, altura;

        System.out.println("Ingrese la base del rectangulo:");
        base = input.nextDouble();

        System.out.println("Ingrese la altura del rectangulo:");
        altura = input.nextDouble();

        Rectangulo nuevoRect = new Rectangulo(base, altura);

        return nuevoRect;
    }

    public double area (Rectangulo _rect) {
        return (_rect.getBase()*_rect.getAltura());
    }

    public double perimetro (Rectangulo _rect) {
        return (2*_rect.getBase()+2*_rect.getAltura());
    }

    public void dibujarRect (Rectangulo _rect) {

        for (int i = 0; i < _rect.getAltura(); i++) {

            for (int j = 0; j < _rect.getBase(); j++) {

                System.out.print("*");

            }
            System.out.println();
        }
    }
}
