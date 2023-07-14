/*
La entidad "Rutina" debe tener los siguientes atributos: id, nombre, duracion, nivelDificultad, descripcion
*/

package ActividadExtra4.Entidades;

public class Rutina {

    private int id, nivelDificultad;
    private double duracion;
    private String nombre, descripcion;

    public Rutina() {
    }

    public Rutina(int id, int nivelDificultad, double duracion, String nombre, String descripcion) {
        this.id = id;
        this.nivelDificultad = nivelDificultad;
        this.duracion = duracion;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public int getNivelDificultad() {
        return nivelDificultad;
    }

    public double getDuracion() {
        return duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNivelDificultad(int nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return  "ID: " + id +
                ", Nombre: '" + nombre + '\'' +
                ", Descripcion: '" + descripcion + '\'' +
                ", Nivel de Dificultad: " + nivelDificultad +
                ", Duracion: " + duracion + " meses";
    }
}
