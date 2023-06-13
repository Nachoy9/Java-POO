/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
*/

package Ejercicio5.Principal;

import Ejercicio5.Entidades.Cuenta;
import Ejercicio5.Servicios.CuentaServicio;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean salir = false;
        int opc;

        System.out.println("Bienvenido al gestor de cuenta:\n");

        CuentaServicio cServ = new CuentaServicio();

        Cuenta cuenta = cServ.crearCuenta();

        while (!salir) {

            System.out.println("\nMenu principal:");
            System.out.println("\nCuenta: " + cServ.getnCuenta(cuenta) + ", DNI: " + cServ.getDni(cuenta) + "\n");
            System.out.println("1. Cargar Saldo.");
            System.out.println("2. Retirar Saldo.");
            System.out.println("3. Extraccion Rapida.");
            System.out.println("4. Consultar Saldo.");
            System.out.println("5. Consultar Datos.");
            System.out.println("6. Salir.\n");

            System.out.println("Ingrese opcion:");
            opc = input.nextInt();

            switch (opc) {
                case 1:

                    cServ.ingresar(cuenta);
                    break;

                case 2:

                    cServ.retirar(cuenta);
                    break;

                case 3:

                    cServ.extraccionRapida(cuenta);
                    break;

                case 4:

                    System.out.println("\nEl saldo actual es $ " + cServ.getsActual(cuenta));
                    break;

                case 5:

                    System.out.println("\nDatos completos de la cuenta:");
                    System.out.println(cServ.consultarDatos(cuenta));
                    break;

                case 6:

                    System.out.println("\nCerrando gestor de cuentas...\n");
                    salir = true;
                    break;

                default:
                    break;
            }
        }
    }
}
