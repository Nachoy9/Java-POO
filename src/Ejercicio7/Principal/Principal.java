/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Los métodos que se implementarán son:

* Un constructor por defecto.
* Un constructor con todos los atributos como parámetro.
* Métodos getters y setters de cada atributo.
* Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
* Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
* Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.

A continuación, en la clase main hacer lo siguiente:

Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
*/

package Ejercicio7.Principal;

import java.util.Scanner;

import Ejercicio7.Entidades.Persona;
import Ejercicio7.Servicios.PersonaServicio;

public class Principal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        PersonaServicio perServ = new PersonaServicio();
        Persona[] personas = new Persona[4];

        int[] imc = new int[4];
        boolean[] esMayor = new boolean[4];
        int bp = 0, cp = 0, sp = 0, sonMayores = 0;
        float pbp, pcp, psp, psm;

        System.out.println("Bienvenido a la herramienta de calculo de IMC");

        for (int i = 0; i < 4; i++) {

            System.out.println("\nCreando persona Nro " + (i+1) + ":\n");
            personas[i] = perServ.crearPersona();

            imc[i] = perServ.calcularIMC(personas[i]);
            esMayor[i] = perServ.esMayorDeEdad(personas[i]);

        }

        for (int i = 0; i < 4; i++) {

            switch (imc[i]) {
                case -1:
                    bp += 1;
                    break;
                case 0:
                    cp += 1;
                    break;
                case 1:
                    sp += 1;
                    break;
                default:
                    break;
            }

            if (esMayor[i]) {
                sonMayores += 1;
            }

        }

        pbp = (float) bp/4*100;
        pcp = (float) cp/4*100;
        psp = (float) sp/4*100;
        psm = (float) sonMayores/4*100;

        System.out.println("\nLas personas con peso por debajo del ideal representan el " + pbp + " %");
        System.out.println("Las personas con peso ideal representan el " + pcp + " %");
        System.out.println("Las personas con peso por encima del ideal representan el " + psp + " %");
        System.out.println("Las personas mayores de edad representan el " + psm + " %");
    }
}
