package EjercicioExtra6.Servicios;

import java.util.Arrays;
import java.util.Scanner;
import EjercicioExtra6.Entidades.Ahorcado;

public class AhorcadoServicio {

    private static Scanner input = new Scanner(System.in);

    public Ahorcado crearJuego() {

        String palabra = "";
        String [] vecPalabra;
        boolean[] aciertos;
        int vidas = 0;

        while (palabra.isEmpty()) {

            System.out.println("Ingrese la palabra secreta:");
            palabra = input.nextLine().toUpperCase();

            if (palabra.isEmpty()) {
                System.out.println("Palabra incorrecta, intente nuevamente");
            }
        }

        while (vidas <= 0) {

            System.out.println("Ingrese cantidad de vidas:");
            vidas = input.nextInt();
            input.nextLine();

            if (vidas <= 0) {
                System.out.println("Numero incorrecto, intente nuevamente");
            }
        }

        vecPalabra = new String[palabra.length()];
        aciertos = new boolean[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {

            vecPalabra[i] = String.valueOf(palabra.charAt(i));
            aciertos[i] = false;

        }

        return new Ahorcado(vecPalabra,aciertos,vidas);
    }

    public int longitud(Ahorcado _ahorcado) {
        return _ahorcado.getPalabra().length;
    }

    public boolean buscar(Ahorcado _ahorcado, String letra) {

        boolean encontrada = false;
        boolean[] _aciertos = _ahorcado.getAciertos();

        for (int i = 0; i < _ahorcado.getPalabra().length; i++) {

            if (_ahorcado.getPalabra()[i].equalsIgnoreCase(letra)) {
                _aciertos[i] = true;
                encontrada = true;
                System.out.println("Letra encontrada en la posicion " + (i+1) + "!");
            }
        }

        if (!encontrada) {
            System.out.println("Letra no encontrada!");
        }

        _ahorcado.setAciertos(_aciertos);

        return encontrada;
    }

    public int[] encontradas(Ahorcado _ahorcado) {

        int[] _encontrada = new int[2];

        for (int i = 0; i < _ahorcado.getAciertos().length; i++) {

            if (_ahorcado.getAciertos()[i]) {
                _encontrada[0]++;
            } else {
                _encontrada[1]++;
            }
        }

        return _encontrada;
    }

    public int intentos(Ahorcado _ahorcado, boolean acerto) {

        if (!acerto) {
            _ahorcado.setVidas(_ahorcado.getVidas()-1);
        }

        return _ahorcado.getVidas();
    }

    public void juego() {

        Ahorcado ahorcado = crearJuego();
        int[] encontradas = encontradas(ahorcado);
        String letra = "";

        System.out.println("\nJuego creado\n");

        while (ahorcado.getVidas() > 0 && encontradas[0] != ahorcado.getPalabra().length) {

            System.out.println("\n---------------------------------------\n");
            System.out.println("Longitud de la palabra: " + longitud(ahorcado));
            System.out.println("Vidas: " + intentos(ahorcado,true));
            System.out.println("Letras encontradas: " + encontradas[0] + " - Letras faltantes: " + encontradas[1] + "\n");

            for (int i = 0; i < ahorcado.getPalabra().length; i++) {

                if (ahorcado.getAciertos()[i]) {
                    System.out.print(" " + ahorcado.getPalabra()[i]+ " ");
                } else {
                    System.out.print(" _ ");
                }
            }

            System.out.print("\n\nIngrese la letra a buscar: \n");
            letra = input.nextLine();

            if (letra.length() == 1) {

                intentos(ahorcado,buscar(ahorcado,letra));
                encontradas = encontradas(ahorcado);

            } else {
                System.out.println("\nInput incorrecto, intente nuevamente.");
            }
        }

        if (encontradas[0] == ahorcado.getPalabra().length) {

            System.out.println("\n---------------------------------------\n");
            System.out.println("Palabra encontrada!!\n");

            for (int i = 0; i < ahorcado.getPalabra().length; i++) {
                System.out.print(" " + ahorcado.getPalabra()[i]+ " ");
            }

            System.out.println("\n\n---------------------------------------\n");

        } else {
            System.out.println("\n---------------------------------------\n");
            System.out.println("Fin del juego, no ha adivinado la palabra.\n");
        }
    }
}
