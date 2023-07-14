/*
La clase "ServicioRutina" debe tener los siguientes métodos de CRUD:
* crearRutina(Rutina rutina): recibe un objeto de tipo Rutina y lo agrega al sistema.
* obtenerRutinas(): devuelve una lista con todas las rutinas registradas en el sistema.
* actualizarRutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion): recibe el identificador
de una rutina existente y los nuevos datos de la rutina, y actualiza la información correspondiente en el sistema.
* eliminarRutina(int id): recibe el identificador de una rutina existente y la elimina del sistema.
*/

package ActividadExtra4.Servicios;

import java.util.ArrayList;
import java.util.Scanner;
import ActividadExtra4.Entidades.Rutina;

public class ServicioRutina {

    private ArrayList<Rutina> rutinas = new ArrayList<Rutina>();
    private static Scanner input = new Scanner(System.in);

    public void crearRutina() {

        Rutina rutina = new Rutina();

        if (rutinas.size() >= 5) {
            System.out.println("Para añadir una nueva rutina debe eliminar alguna de las existentes");
            return;
        }

        int id = rutinas.size() + 1;

        rutina.setId(id);
        rutinas.add(rutina);

        System.out.println("\nEl ID de la rutina generada es " + rutina.getId() + "\n");

        nombreRutina(id);
        descripcionRutina(id);
        dificultadRutina(id);
        duracionRutina(id);

        System.out.println("Rutina creada:");
        System.out.println(rutinas.get(id-1).toString());
    }

    public void obtenerRutinas() {

        if (!existenRutinas()) {
            System.out.println("No existen rutinas.");
            return;
        }

        System.out.println("\nListado de rutinas:");

        for (int i = 0; i < rutinas.size(); i++) {
            System.out.println(rutinas.get(i).toString());
        }
    }

    public String obtenerRutina(int id) {

        if (rutinas.get(id-1) != null) {
            return rutinas.get(id-1).getNombre();
        } else {
            return null;
        }
    }

    public void actualizarRutina() {

        if (!existenRutinas()) {
            System.out.println("No existen rutinas.");
            return;
        }

        int opc = 0;

        System.out.println("Ingrese el ID de la rutina que desea actualizar:");
        int id = input.nextInt();
        input.nextLine();

        if (id > rutinas.size()) {
            System.out.println("La rutina no existe, intente nuevamente.");
            return;
        }

        System.out.println("\n" + rutinas.get(id-1).toString() + "\n");

        while (opc == 0) {

            System.out.println("Seleccione el campo que desea actualizar:");
            System.out.println("1. Nombre.");
            System.out.println("2. Descripcion.");
            System.out.println("3. Dificultad.");
            System.out.println("4. Duracion.");
            System.out.println("5. Cancelar.");
            opc = input.nextInt();
            input.nextLine();

            switch (opc) {
                case 1:
                    nombreRutina(id);
                    break;
                case 2:
                    descripcionRutina(id);
                    break;
                case 3:
                    dificultadRutina(id);
                    break;
                case 4:
                    duracionRutina(id);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion incorrecta, intente nuevamente.");
                    opc = 0;
                    break;
            }
        }
    }

    public void eliminarRutina() {

        if (!existenRutinas()) {
            System.out.println("No existen rutinas.");
            return;
        }

        boolean eliminar = false;
        int opc = 0;

        System.out.println("Ingrese el ID de la rutina que desea eliminar:");
        int id = input.nextInt();
        input.nextLine();

        if (id > rutinas.size()) {
            System.out.println("La rutina no existe, intente nuevamente.");
            return;
        }

        System.out.println("\n" + rutinas.get(id-1).toString() + "\n");

        while (opc == 0) {

            System.out.println("Confirma eliminacion?");
            System.out.println("1. Confirmar.");
            System.out.println("2. Cancelar.");
            System.out.println("Ingrese opcion:");
            opc = input.nextInt();
            input.nextLine();

            switch (opc) {
                case 1:

                    rutinas.remove(id-1);
                    System.out.println("Rutina eliminada");

                    // Reasigno ID a cada una de las rutinas
                    for (int i = 0; i < rutinas.size(); i++) {
                        rutinas.get(i).setId(i+1);
                    }

                    break;
                case 2:
                    System.out.println("Rutina no eliminada");
                    break;
                default:
                    System.out.println("Opcion incorrecta, intente nuevamente.");
                    opc = 0;
                    break;
            }
        }
    }

    private void nombreRutina(int id) {
        System.out.println("Ingrese el nombre de la rutina:");
        rutinas.get(id-1).setNombre(input.nextLine());
    }

    private void descripcionRutina(int id) {
        System.out.println("Ingrese la descripcion de la rutina '" + rutinas.get(id-1).getNombre().toUpperCase() + "':");
        rutinas.get(id-1).setDescripcion(input.nextLine());
    }

    private void dificultadRutina(int id) {

        int dificultad = 0;

        while (dificultad <= 0 || dificultad > 10) {

            System.out.println("Ingrese la dificultad de la rutina '" + rutinas.get(id-1).getNombre().toUpperCase() + "' (del 1 al 10):");
            dificultad = input.nextInt();
            input.nextLine();

            if (dificultad <= 0 || dificultad > 10) {
                System.out.println("Rango incorrecto, intente nuevamente.");
            }
        }
        rutinas.get(id-1).setNivelDificultad(dificultad);
    }

    private void duracionRutina(int id) {
        System.out.println("Ingrese la duracion de la rutina '" + rutinas.get(id-1).getNombre().toUpperCase() + "' en meses:");
        rutinas.get(id-1).setDuracion(input.nextDouble());
        input.nextLine();
    }

    public boolean existenRutinas() {
        if (rutinas.size() == 0) {
            return false;
        }

        return true;
    }

    public int cantRutinas() {
        return rutinas.size();
    }
}
