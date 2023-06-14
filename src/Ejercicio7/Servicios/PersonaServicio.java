package Ejercicio7.Servicios;

import java.util.Scanner;
import Ejercicio7.Entidades.Persona;

public class PersonaServicio {

    private Scanner input = new Scanner(System.in);

    public Persona crearPersona () {

        String nombre, sexo = "";
        int edad;
        double peso, altura;

        System.out.println("Ingrese el nombre de la persona:");
        nombre = input.nextLine();

        while (!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("O")) {

            System.out.println("Ingrese el sexo de la persona:");
            sexo = input.nextLine();

            if (!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("O")) {
                System.out.println("Sexo incorrecto, intente nuevamente");
            }
        }

        System.out.println("Ingrese la edad de la persona:");
        edad = input.nextInt();

        System.out.println("Ingrese el peso de la persona:");
        peso = input.nextDouble();

        System.out.println("Ingrese la altura de la persona:");
        altura = input.nextDouble();
        input.nextLine();

        return new Persona(nombre, sexo, edad, peso, altura);
    }

    public int calcularIMC (Persona _persona) {

        double imc = (_persona.getPeso()/Math.pow(_persona.getAltura(),2));

        if (imc < 20) {
            return -1;
        } else if (20 <= imc && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad (Persona _persona) {
        return _persona.getEdad() >= 18;
    }
}
