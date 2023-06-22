package Ejercicio13.Entidades;

import java.util.Arrays;

public class Curso {

    private String nombreCurso, turno;
    private String[] alumnos = new String[5];
    private int horasDia, diasSemana;
    private double precioHora;

    public Curso() {
    }

    public Curso(String nombreCurso, String turno, String[] alumnos, int horasDia, int diasSemana, double precioHora) {
        this.nombreCurso = nombreCurso;
        this.turno = turno;
        this.alumnos = alumnos;
        this.horasDia = horasDia;
        this.diasSemana = diasSemana;
        this.precioHora = precioHora;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public String getTurno() {
        return turno;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public int getHorasDia() {
        return horasDia;
    }

    public int getdiasSemana() {
        return diasSemana;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    public void setHorasDia(int horasDia) {
        this.horasDia = horasDia;
    }

    public void setDiasSemana(int diasSemana) {
        this.diasSemana = diasSemana;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    @Override
    public String toString() {
        return "Curso {" +
                " Nombre Curso = '" + nombreCurso + '\'' +
                ", Turno = '" + turno + '\'' +
                ", Alumnos = " + Arrays.toString(alumnos) +
                ", Horas por dia = " + horasDia +
                ", Dias por semana = " + diasSemana +
                ", Precio por hora = " + precioHora +
                '}';
    }
}
