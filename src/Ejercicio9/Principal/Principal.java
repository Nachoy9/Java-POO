/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:

a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
*/

package Ejercicio9.Principal;

import Ejercicio9.Entidades.Matematica;
import Ejercicio9.Servicios.MatematicaServicio;

public class Principal {

    public static void main(String[] args) {

        MatematicaServicio matSer = new MatematicaServicio();

        double mayor, potencia, raiz;

        System.out.println("Generando objeto 'Matematica'...\n");

        Matematica matematica = matSer.crearMatematica();

        System.out.println("El objeto creado es: " + matematica.toString() + "\n");

        mayor = matSer.devolverMayor(matematica);

        if (mayor == 0) {
            System.out.println("Ambos numeros son iguales: " + matematica.getNum1() + " = " + matematica.getNum2() + "\n");
        } else {
            System.out.println("El numero mas grande es: " + mayor + "\n");
        }

        potencia = matSer.calcularPotencia(matematica);

        System.out.println("El resultado de elevar el mayor numero por el menor es: " + potencia + "\n");

        raiz = matSer.calcularRaiz(matematica);

        System.out.println("La raiz cuadrada del numero menor es: " + raiz + "\n");
    }
}
