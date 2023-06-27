package EjercicioExtra4.Servicios;

import java.util.Scanner;
import EjercicioExtra4.Entidades.NIF;

public class NIFServicio {

    private static Scanner input = new Scanner(System.in);
    private static String[] nif = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};

    public NIF crearNIF() {

        long num = 0;

        while (num < 1 || num > 99999999) {

            System.out.println("Ingrese el numero de DNI:");
            num = input.nextLong();

            if (num < 1 || num > 99999999) {
                System.out.println("\nNumero incorrecto, intente nuevamente.\n");
            }
        }

        return new NIF(num,nif[(int) (num%23)]);
    }

    public void mostrarNIF(NIF _nif) {

        String ceros = "";
        long aux = _nif.getNum();
        int contador = 0;

        while (aux > 0) {
            aux = aux/10;
            contador++;
        }

        for (int i = 0; i < contador; i++) {
            ceros = ceros + "0";
        }

        System.out.println(ceros + _nif.toString());
    }

}
