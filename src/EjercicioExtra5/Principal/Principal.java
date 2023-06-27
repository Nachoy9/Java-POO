/*
Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el
usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
*/

package EjercicioExtra5.Principal;

import java.util.Scanner;
import EjercicioExtra5.Entidades.Meses;
import EjercicioExtra5.Servicios.MesesServicio;

public class Principal {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        MesesServicio mesSer = new MesesServicio();

        Meses mesSecreto = mesSer.mesScreto();
        String intento = "";

        System.out.println("El mes secreto se ha generado:");

        System.out.println("\nAdivine el mes secreto. Introduzca el nombre del mes en minúsculas:");
        intento = input.nextLine();

        while (!mesSer.esElMes(mesSecreto,intento)) {

            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
            intento = input.nextLine();

        }

        System.out.println("¡Ha acertado!");
    }
}
