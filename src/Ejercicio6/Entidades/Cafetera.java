package Ejercicio6.Entidades;

public class Cafetera {

    private double capMaxima, cantActual;

    public Cafetera() {
    }

    public Cafetera(double capMaxima, double cantActual) {
        this.capMaxima = capMaxima;
        this.cantActual = cantActual;
    }

    public double getCapMaxima() {
        return capMaxima;
    }

    public double getCantActual() {
        return cantActual;
    }

    public void setCapMaxima(double capMaxima) {
        this.capMaxima = capMaxima;
    }

    public void setCantActual(double cantActual) {
        this.cantActual = cantActual;
    }
}
