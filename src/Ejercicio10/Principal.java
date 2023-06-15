/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
1. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
*/

package Ejercicio10;

import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {

        int[] array1, array2;

        array1 = new int[50];
        array2 = new int[20];

        inicializarArray(array1);

        System.out.println("El Array1 generado es:");
        mostrarArray(array1);

        System.out.println("\nEl Array1 ordenado es:");
        Arrays.sort(array1);
        mostrarArray(array1);

        System.out.println("\nEl Array2 generado es:");
        copiarElementos(array1,array2,10);
        Arrays.fill(array2,10,20,1);
        mostrarArray(array2);

    }

    public static int[] inicializarArray(int[] _array) {

        for (int i = 0; i < _array.length; i++) {
            _array[i] = (int) (Math.random() * 100 + 1);
        }

        return _array;
    }

    public static int[] copiarElementos(int[] _array1, int[] _array2, int _n) {

        for (int i = 0; i < _n; i++) {
            _array2[i] = _array1[i];
        }

        return _array2;
    }

    public static void mostrarArray (int[] _array) {

        System.out.print("[");

        for (int i = 0; i < _array.length; i++) {

            if (i == _array.length-1) {
                System.out.println(_array[i] + "]");
            } else {
                System.out.print(_array[i] + ",");
            }
        }
    }
}
