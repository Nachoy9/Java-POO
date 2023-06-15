package Ejercicio12.Entidades;

import java.util.Date;

public class Persona {

    private String nombre;
    private Date fechaNac;

    public Persona() {
    }

    public Persona(String nombre, Date fechaNac) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Persona = { " +
                "Nombre = '" + nombre + '\'' +
                ", Fecha de Nacimiento = " + fechaNac +
                " }";
    }
}
