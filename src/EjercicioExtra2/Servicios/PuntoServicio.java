package EjercicioExtra2.Servicios;

import EjercicioExtra2.Entidades.Punto;

public class PuntoServicio {

    public Punto crearPunto(double _x, double _y) {

        Punto _punto = new Punto(_x,_y);
        return _punto;

    }

    public double calcularDistancia(Punto _punto1, Punto _punto2) {

        return Math.sqrt(Math.pow(_punto2.getX() - _punto1.getX(), 2)+Math.pow(_punto2.getY() - _punto1.getY(), 2));

    }
}
