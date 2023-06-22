package Ejercicio13.Servicios;

import java.util.Scanner;
import Ejercicio13.Entidades.Curso;
import javafx.scene.SubScene;

public class CursoServicio {

    private static Scanner input = new Scanner(System.in);

    public void cargarAlumnos(Curso _curso) {

        String[] _alumnos = new String[5];

        for (int i = 0; i < 5; i++) {

            System.out.println("\nIngrese el nombre del alumno Nro " + (i+1) + " o aprete enter si no desea añadir otro:");
            _alumnos[i] = input.nextLine();

        }

        _curso.setAlumnos(_alumnos);
    }

    public Curso crearCurso() {

        Curso _curso = new Curso();
        int turno = 0;

        System.out.println("Ingrese el nombre del curso:");
        _curso.setNombreCurso(input.nextLine());

        while (turno != 1 && turno != 2) {

            System.out.println("\nIngrese el turno del curso:\n1. Turno Mañana.\n2. Turno Tarde");
            turno = input.nextInt();
            input.nextLine();

            if (turno == 1) {
                _curso.setTurno("Mañana");
            } else if (turno == 2) {
                _curso.setTurno("Tarde");
            } else {
                System.out.println("\nOpcion incorrecta, intente nuevamente.");
            }
        }

        cargarAlumnos(_curso);

        System.out.println("\nCuantas horas por dia se dictara este curso?");
        _curso.setHorasDia(input.nextInt());

        System.out.println("\nCuantos dias a la semana se dictara este curso?");
        _curso.setDiasSemana(input.nextInt());

        System.out.println("\nQue precio por hora tiene este curso?");
        _curso.setPrecioHora(input.nextDouble());

        return _curso;
    }

    public double calcularGananciaSemanal(Curso _curso) {

        int contador = 0;

        for (String alumno : _curso.getAlumnos()) {
            if (!alumno.isEmpty()) {
                contador++;
            }
        }

        return _curso.getHorasDia() * _curso.getdiasSemana() * contador * _curso.getPrecioHora();
    }
}

