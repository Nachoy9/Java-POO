package Ejercicio6.Servicios;

import java.util.Scanner;

import Ejercicio5.Entidades.Cuenta;
import Ejercicio6.Entidades.Cafetera;

public class CafeteraServicio {

    private Scanner input = new Scanner(System.in);

    public Cafetera crearCafetera () {

        double capMaxima, cantActual;

        System.out.println("\nIngrese la capacidad maxima de la cafetera (en gr):");
        capMaxima = input.nextDouble();

        System.out.println("Ingrese la cantidad actual de cafe (en gr):");
        cantActual = input.nextDouble();

        Cafetera cafetera = new Cafetera(capMaxima,cantActual);

        return cafetera;
    }

    public void llenarCafetera (Cafetera _cafetera) {
        _cafetera.setCantActual(_cafetera.getCapMaxima());
    }

    public void servirTaza (Cafetera _cafetera, double _taza) {

        if (_cafetera.getCantActual() < _taza) {
            System.out.println("\nNo hay suficiente cafe para llenar la taza, se serviran " + _cafetera.getCantActual() + " gr");
            _cafetera.setCantActual(0);
        } else {
            _cafetera.setCantActual(_cafetera.getCantActual()-_taza);
        }

    }

    public void vaciarCafetera (Cafetera _cafetera) {
        _cafetera.setCantActual(0);
    }

    public void agregarCafe (Cafetera _cafetera, double _cafe) {

        if (_cafetera.getCantActual() + _cafe > _cafetera.getCapMaxima()) {
            System.out.println("\nLa cantidad ingresada excede la capacidad máxima, se ha llenado la cafetera.");
            _cafetera.setCantActual(_cafetera.getCapMaxima());
        } else {
            _cafetera.setCantActual(_cafetera.getCantActual()+_cafe);
        }

    }

    public float getCM (Cafetera _cafetera) {
        return (float) _cafetera.getCapMaxima();
    }

    public float getCA (Cafetera _cafetera) {
        return (float) _cafetera.getCantActual();
    }

}