package ActividadExtra1.Servicios;

import java.util.Scanner;
import ActividadExtra1.Entidades.Vehiculo;

public class VehiculoServicio {

    public Vehiculo crearVehiculo () {

        Scanner input = new Scanner(System.in);

        String marca, modelo, tipo = "";
        int anio, opc = 0;

        System.out.println("Ingrese marca del vehiculo");
        marca = input.nextLine();

        System.out.println("Ingrese modelo del vehiculo");
        modelo = input.nextLine();

        while (opc != 1 && opc != 2 && opc != 3) {

            System.out.println("Ingrese tipo del vehiculo.");
            System.out.println("1. Automovil");
            System.out.println("2. Motocicleta");
            System.out.println("3. Bicicleta");
            opc = input.nextInt();
            input.nextLine();

            switch (opc) {
                case 1:
                    tipo = "Automovil";
                    break;
                case 2:
                    tipo = "Motocicleta";
                    break;
                case 3:
                    tipo = "Bicicleta";
                    break;
                default:
                    System.out.println("Opcion incorrecta, intente nuevamente");
                    break;
            }
        }

        System.out.println("Ingrese año del vehiculo");
        anio = input.nextInt();

        return new Vehiculo(marca,modelo,tipo,anio);
    }

    public int moverse (Vehiculo _vehiculo, int tiempo) {

        int velocidad;

        if (_vehiculo.getTipo().equalsIgnoreCase("Automovil")) {
            velocidad = 3;
        } else if (_vehiculo.getTipo().equalsIgnoreCase("Motocicleta")) {
            velocidad = 2;
        } else {
            velocidad = 1;
        }

        return velocidad * tiempo;
    }

    public int frenar (Vehiculo _vehiculo) {

        if (_vehiculo.getTipo().equalsIgnoreCase("Bicicleta")) {
            return 0;
        } else {
            return 2;
        }
    }


}
