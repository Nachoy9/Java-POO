package ActividadExtra1.Principal;

import java.util.Scanner;

import ActividadExtra1.Entidades.Vehiculo;
import ActividadExtra1.Servicios.VehiculoServicio;

public class Principal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        VehiculoServicio veSer = new VehiculoServicio();
        Vehiculo[] vehiculos = new Vehiculo[3];

        int dist1, dist2, dist3, dist4, max = 0, j = 0;

        for (int i = 0; i < 3; i++) {

            vehiculos[i] = veSer.crearVehiculo();

        }

        for (int i = 0; i < 3; i++) {

            dist1 = veSer.moverse(vehiculos[i],5) + veSer.frenar(vehiculos[i]);
            dist2 = veSer.moverse(vehiculos[i],10) + veSer.frenar(vehiculos[i]);
            dist3 = veSer.moverse(vehiculos[i],60) + veSer.frenar(vehiculos[i]);
            dist4 = veSer.moverse(vehiculos[i],300) + veSer.frenar(vehiculos[i]);

            if (dist4 > max) {
                max = dist4;
                j = i;
            }

            System.out.println("\nEl vehiculo tipo '" + vehiculos[i].getTipo() + "' se desplaza " + dist1 + " en 5 seg");
            System.out.println("El vehiculo tipo '" + vehiculos[i].getTipo() + "' se desplaza " + dist2 + " en 10 seg");
            System.out.println("El vehiculo tipo '" + vehiculos[i].getTipo() + "' se desplaza " + dist3 + " en 60 seg");

        }

        System.out.println("\nEl vehiculo que mas se desplazo en 5min fue el '" + vehiculos[j].getTipo() + "' con " + max + " m");

    }
}
