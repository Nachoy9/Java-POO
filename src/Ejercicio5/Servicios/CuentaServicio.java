package Ejercicio5.Servicios;

import java.util.Scanner;
import Ejercicio5.Entidades.Cuenta;

public class CuentaServicio {

    private Scanner input = new Scanner(System.in);

    public Cuenta crearCuenta () {

        int nCuenta, sActual;
        long dni;

        nCuenta = (int) (Math.random()*100000 + 1);
        System.out.println("Numero de cuenta generado (" + nCuenta + ").");

        System.out.println("\nIngrese el DNI del usuario:");
        dni = input.nextLong();

        System.out.println("Ingrese el saldo actual del usuario:");
        sActual = input.nextInt();

        Cuenta cuenta = new Cuenta(nCuenta,sActual,dni);

        return cuenta;
    }

    public int getnCuenta(Cuenta _cuenta) {
        return _cuenta.getnCuenta();
    }

    public int getsActual(Cuenta _cuenta) {
        return _cuenta.getsActual();
    }

    public long getDni(Cuenta _cuenta) {
        return _cuenta.getDni();
    }

    public void ingresar(Cuenta _cuenta) {
        System.out.println("Ingrese el monto a acreditar:");
        _cuenta.setsActual(_cuenta.getsActual()+input.nextInt());
    }

    public void retirar(Cuenta _cuenta) {
        System.out.println("Ingrese el monto a retirar:");
        _cuenta.setsActual(_cuenta.getsActual()-input.nextInt());
    }

    public void extraccionRapida(Cuenta _cuenta) {
        _cuenta.setsActual((int) (_cuenta.getsActual() * 0.8));
    }

    public String consultarDatos(Cuenta _cuenta) {
        return _cuenta.toString();
    }
}
