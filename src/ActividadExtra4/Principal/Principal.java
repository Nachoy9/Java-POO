/*
Codigo principal
*/

package ActividadExtra4.Principal;

import java.util.Scanner;
import ActividadExtra4.Servicios.ServicioCliente;
import ActividadExtra4.Servicios.ServicioRutina;

public class Principal {

    public static void main(String[] args) {

        ServicioCliente serC = new ServicioCliente();
        ServicioRutina serR = new ServicioRutina();
        Scanner input = new Scanner(System.in);

        boolean salir = false;
        int opc;

        while (!salir) {

            System.out.println("\nMenu principal\n");
            System.out.println("1. Registrar cliente.");
            System.out.println("2. Mostrar clientes.");
            System.out.println("3. Actualizar cliente.");
            System.out.println("4. Eliminar cliente.");
            System.out.println("5. Crear rutina.");
            System.out.println("6. Mostrar rutinas.");
            System.out.println("7. Actualizar rutina.");
            System.out.println("8. Eliminar rutina.");
            System.out.println("9. Salir");
            System.out.println("\nIngrese opcion:");

            opc = input.nextInt();

            switch (opc) {
                case 1:
                    if (!serR.existenRutinas()) {
                        System.out.println("Antes de registrar un cliente debe crear al menos una rutina");
                        return;
                    }
                    serC.registrarCliente(serR);
                    break;
                case 2:
                    serC.obtenerClientes();
                    break;
                case 3:
                    serC.actualizarCliente(serR);
                    break;
                case 4:
                    serC.eliminarCliente();
                    break;
                case 5:
                    serR.crearRutina();
                    break;
                case 6:
                    serR.obtenerRutinas();
                    break;
                case 7:
                    serR.actualizarRutina();
                    break;
                case 8:
                    serR.eliminarRutina();
                    break;
                case 9:
                    System.out.println("\nCerrando aplicacion, hasta luego.");
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion incorrecta, intente nuevamente.");
                    break;
            }

        }

    }
}
