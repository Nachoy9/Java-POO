package EjercicioExtra3.Servicios;

import EjercicioExtra3.Entidades.Ecuacion;

public class ServicioEcuacion {

    public Ecuacion crearEcuacion(double _a, double _b, double _c) {
        return new Ecuacion(_a,_b,_c);
    }

    public double calcDiscriminante(Ecuacion _ecuacion) {
        return Math.pow(_ecuacion.getB(), 2) - 4 * _ecuacion.getA() * _ecuacion.getC();
    }

    public int cantRaices(Ecuacion _ecuacion) {

        if (calcDiscriminante(_ecuacion) < 0) {
            return 3;
        } else if (calcDiscriminante(_ecuacion) == 0) {
            return 1;
        } else {
            return 2;
        }
    }

    public double[] obtenerRaices(Ecuacion _ecuacion) {

        double[] _raices = new double[(int) cantRaices(_ecuacion)];

        switch ((int) cantRaices(_ecuacion)) {
            case 1:
                _raices[0] = - _ecuacion.getB() / (2 * _ecuacion.getA());
                break;
            case 2:
                _raices[0] = ( - _ecuacion.getB() + Math.sqrt(calcDiscriminante(_ecuacion))) / (2 * _ecuacion.getA());
                _raices[1] = ( - _ecuacion.getB() - Math.sqrt(calcDiscriminante(_ecuacion))) / (2 * _ecuacion.getA());
                break;
            case 3:
                _raices[0] = (Math.sqrt(Math.abs(calcDiscriminante(_ecuacion)))) / (2 * _ecuacion.getA());
                _raices[1] = (-Math.sqrt(Math.abs(calcDiscriminante(_ecuacion)))) / (2 * _ecuacion.getA());
                break;
            default:
                break;
        }
        return _raices;
    }

    public void calcular(Ecuacion _ecuacion) {

        double[] raices = obtenerRaices(_ecuacion);

        for (int i = 0; i < cantRaices(_ecuacion); i++) {

            switch (cantRaices(_ecuacion)) {
                case 1:
                    System.out.println("La ecuacion tiene raiz doble " + raices[i]);
                    break;
                case 2:
                    System.out.println("La raiz Nro " + (i+1) + " es: " + raices[i]);
                    break;
                case 3:
                    if (i != 2) {
                        System.out.println("La raiz imaginaria Nro " + (i+1) + " es: " + (- _ecuacion.getB() / (2 * _ecuacion.getA())) + " + (" + raices[i] + ")i");
                    }
                    break;
            }
        }
    }
}
