/*
La entidad "Cliente" debe tener los siguientes atributos: id, nombre, edad, altura, peso, objetivo (cadena de caracteres)
*/

package ActividadExtra4.Entidades;

public class Cliente {

    private int id, edad;
    private double altura, peso;
    private String nombre, objetivo;

    public Cliente() {
    }

    public Cliente(int id, int edad, double altura, double peso, String nombre, String objetivo) {
        this.id = id;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.nombre = nombre;
        this.objetivo = objetivo;
    }

    public int getId() {
        return id;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    @Override
    public String toString() {
        return  "ID: " + id +
                ", Nombre: '" + nombre + '\'' +
                ", Edad: " + edad + " años" +
                ", Altura: " + altura + " m" +
                ", Peso: " + peso + " kg" +
                ", Objetivo: '" + objetivo;
    }
}
