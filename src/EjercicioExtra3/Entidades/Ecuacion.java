package EjercicioExtra3.Entidades;

public class Ecuacion {

    double a, b, c;

    public Ecuacion() {
    }

    public Ecuacion(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "y = (" +
                a + ")x^2 + (" +
                b + ")x + (" +
                c + ")";
    }
}
