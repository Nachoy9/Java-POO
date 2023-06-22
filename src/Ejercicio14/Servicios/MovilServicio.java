package Ejercicio14.Servicios;

import java.sql.SQLOutput;
import java.util.Scanner;
import Ejercicio14.Entidades.Movil;

public class MovilServicio {

    private static Scanner input = new Scanner(System.in);

    public void ingresarCodigo(Movil _movil) {

        boolean ingresado = false;
        int aux;
        int[] codigo = new int[7];

        while (!ingresado) {

            System.out.println("\nIngrese el codigo de identificacion del movil:");
            input.nextLine();

            if (input.hasNextInt()) {

                aux = Math.abs(input.nextInt());

                if (aux > 9999999) {

                    System.out.println("\nEl codigo ingresado contiene mas de 7 numeros. Intente nuevamente.");

                } else {

                    for (int i = 7; i > 0; i--) {

                        codigo[i-1] = aux % 10;
                        aux = aux / 10;

                    }

                    ingresado = true;
                }

            } else {

                System.out.println("\nEl codigo ingresado es incorrecto. Intente nuevamente.");

            }
        }

        _movil.setCodigo(codigo);
    }

    public Movil cargarMovil() {

        Movil _movil = new Movil();

        System.out.println("\nIngrese la marca del movil:");
        _movil.setMarca(input.nextLine());

        System.out.println("\nIngrese el modelo del movil:");
        _movil.setModelo(input.nextLine());

        System.out.println("\nIngrese la memoria RAM del del movil:");
        _movil.setMemoriaRam(input.nextInt());

        System.out.println("\nIngrese el almacenamiento del movil:");
        _movil.setAlmacenamiento(input.nextInt());

        System.out.println("\nIngrese el precio del movil:");
        _movil.setPrecio(input.nextDouble());

        ingresarCodigo(_movil);

        return _movil;
    }
}

