package Ejercicio5.Entidades;

public class Cuenta {

    private int nCuenta, sActual;
    private long dni;

    public Cuenta() {
    }

    public Cuenta(int nCuenta, int sActual, long dni) {
        this.nCuenta = nCuenta;
        this.sActual = sActual;
        this.dni = dni;
    }

    public int getnCuenta() {
        return nCuenta;
    }

    public int getsActual() {
        return sActual;
    }

    public long getDni() {
        return dni;
    }

    public void setnCuenta(int nCuenta) {
        this.nCuenta = nCuenta;
    }

    public void setsActual(int sActual) {
        this.sActual = sActual;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "nCuenta=" + nCuenta +
                ", sActual=" + sActual +
                ", dni=" + dni +
                '}';
    }
}
