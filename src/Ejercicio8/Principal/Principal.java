/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud.
En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
- Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
*/

package Ejercicio8.Principal;

import java.util.Scanner;

import Ejercicio8.Entidades.Cadena;
import Ejercicio8.Servicios.CadenaServicio;

public class Principal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        CadenaServicio cadSer = new CadenaServicio();
        Cadena cadena;

        String frase1, frase2, letra1, letra2, letra3;
        int longitud;

        System.out.println("Ingrese una frase:");
        frase1 = input.nextLine();
        longitud = frase1.length();

        cadena = cadSer.crearCadena(frase1,longitud);

        System.out.println("La frase contiene " + cadSer.mostrarVocales(cadena) + " vocales");
        System.out.println("La frase invertida es: '" + cadSer.invertirFrase(cadena) + "'.");

        System.out.println("\nIngrese una letra:");
        letra1 = input.nextLine();

        System.out.println("La letra '" + letra1 + "' se encontro " + cadSer.vecesRepetido(cadena,letra1) + " veces");

        System.out.println("\nIngrese una frase:");
        frase2 = input.nextLine();

        if (cadSer.compararLongitud(cadena,frase2)) {
            System.out.println("Las frases tienen el mismo largo");
        } else {
            System.out.println("Las frases tienen distinto largo");
        }

        System.out.println("El resultado de unir las frases es '" + cadSer.unirFrases(cadena,frase2) + "'.");

        System.out.println("\nIngrese una letra:");
        letra2 = input.nextLine();

        System.out.println("El resultado de remplazar la letra 'A' por '" + letra2 + "' en la frase es '" + cadSer.reemplazar(cadena,letra2) + "'.");

        System.out.println("\nIngrese una letra:");
        letra3 = input.nextLine();

        if (cadSer.contiene(cadena,letra3)) {
            System.out.println("La frase contiene la letra ingresada");
        } else {
            System.out.println("La frase no contiene la letra ingresada");
        }
    }
}
