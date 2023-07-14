/*
La clase "ServicioCliente" debe tener los siguientes métodos de CRUD:
* registrarCliente: lo registra en el sistema.
* obtenerClientes(): devuelve una lista con todos los clientes registrados en el sistema.
* actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo): recibe el identificador
de un cliente existente y los nuevos datos del cliente, y actualiza la información correspondiente en el sistema.
* eliminarCliente(int id): recibe el identificador de un cliente existente y lo elimina del sistema.
*/

package ActividadExtra4.Servicios;

import java.util.Scanner;
import java.util.ArrayList;
import ActividadExtra4.Entidades.Cliente;

public class ServicioCliente {

    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private static Scanner input = new Scanner(System.in);

    public void registrarCliente(ServicioRutina serR) {

        Cliente cliente = new Cliente();

        int id = clientes.size() + 1;

        cliente.setId(id);
        clientes.add(cliente);

        System.out.println("El ID del cliente generado es " + cliente.getId() + "\n");

        nombreCliente(id);
        edadCliente(id);
        alturaCliente(id);
        pesoCliente(id);
        objetivoCliente(id, serR);

        System.out.println("Cliente generado:\n");
        System.out.println(clientes.get(id-1).toString());
    }

    public void obtenerClientes() {

        if (!existenClientes()) {
            System.out.println("No existen clientes.");
            return;
        }

        System.out.println("\nListado de clientes:");

        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(clientes.get(i).toString());
        }
    }

    public void actualizarCliente(ServicioRutina serR) {

        if (!existenClientes()) {
            System.out.println("No existen clientes.");
            return;
        }

        int opc = 0;

        System.out.println("Ingrese el ID del cliente que desea actualizar:");
        int id = input.nextInt();
        input.nextLine();

        if (id > clientes.size()) {
            System.out.println("El cliente no existe, intente nuevamente.");
            return;
        }

        System.out.println("\n" + clientes.get(id-1).toString() + "\n");

        while (opc == 0) {

            System.out.println("Seleccione el campo que desea actualizar:");
            System.out.println("1. Nombre.");
            System.out.println("2. Edad.");
            System.out.println("3. Altura.");
            System.out.println("4. Peso.");
            System.out.println("5. Objetivo.");
            System.out.println("6. Cancelar.");
            opc = input.nextInt();
            input.nextLine();

            switch (opc) {
                case 1:
                    nombreCliente(id);
                    break;
                case 2:
                    edadCliente(id);
                    break;
                case 3:
                    alturaCliente(id);
                    break;
                case 4:
                    pesoCliente(id);
                    break;
                case 5:
                    objetivoCliente(id, serR);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opcion incorrecta, intente nuevamente.");
                    opc = 0;
                    break;
            }
        }
    }

    public void eliminarCliente() {

        if (!existenClientes()) {
            System.out.println("No existen clientes.");
            return;
        }

        boolean eliminar = false;
        int opc = 0;

        System.out.println("Ingrese el ID del cliente que desea eliminar:");
        int id = input.nextInt();
        input.nextLine();

        if (id > clientes.size()) {
            System.out.println("El cliente no existe, intente nuevamente.");
            return;
        }

        System.out.println("\n" + clientes.get(id-1).toString() + "\n");

        while (opc == 0) {

            System.out.println("Confirma eliminacion?");
            System.out.println("1. Confirmar.");
            System.out.println("2. Cancelar.");
            System.out.println("Ingrese opcion:");
            opc = input.nextInt();
            input.nextLine();

            switch (opc) {
                case 1:
                    clientes.remove(id-1);
                    System.out.println("Cliente eliminado");
                    break;
                case 2:
                    System.out.println("Cliente no eliminado");
                    break;
                default:
                    System.out.println("Opcion incorrecta, intente nuevamente.");
                    opc = 0;
                    break;
            }
        }
    }

    private void nombreCliente(int id) {
        System.out.println("Ingrese el nombre del cliente:");
        clientes.get(id-1).setNombre(input.nextLine());
    }

    private void edadCliente(int id) {
        System.out.println("Ingrese la edad de " + clientes.get(id-1).getNombre().toUpperCase() + ":");
        clientes.get(id-1).setEdad(input.nextInt());
        input.nextLine();
    }

    private void alturaCliente(int id) {
        System.out.println("Ingrese la altura de " + clientes.get(id-1).getNombre().toUpperCase() + " en m:");
        clientes.get(id-1).setAltura(input.nextDouble());
        input.nextLine();
    }

    private void pesoCliente(int id) {
        System.out.println("Ingrese el peso de " + clientes.get(id-1).getNombre().toUpperCase() + " en kg:");
        clientes.get(id-1).setPeso(input.nextDouble());
        input.nextLine();
    }

    private void objetivoCliente(int id, ServicioRutina serR) {

        boolean objetivo = false;

        while (!objetivo) {

            System.out.println("Seleccione el ID de la rutina que desea asignar:");

            serR.obtenerRutinas();

            System.out.println("\nIngrese ID:");
            int opc = input.nextInt();
            input.nextLine();

            if (opc > serR.cantRutinas()) {
                System.out.println("La rutina no existe, intente nuevamente.");
            } else {
                clientes.get(id-1).setObjetivo(serR.obtenerRutina(opc));
                objetivo = true;
            }
        }
    }

    public boolean existenClientes() {
        if (clientes.size() == 0) {
            return false;
        }

        return true;
    }
}
