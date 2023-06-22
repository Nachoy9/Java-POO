package Ejercicio14.Entidades;

import java.util.Arrays;

public class Movil {

    private String marca, modelo;
    private double precio;
    private int memoriaRam, almacenamiento;
    private int[] codigo = new int[7];

    public Movil() {
    }

    public Movil(String marca, String modelo, double precio, int memoriaRam, int almacenamiento, int[] codigo) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Movil {" +
                "Marca = '" + marca + '\'' +
                ", Modelo = '" + modelo + '\'' +
                ", Precio = $ " + precio +
                ", Memoria Ram = " + memoriaRam +
                " GB, Almacenamiento = " + almacenamiento +
                " GB, Codigo = " + Arrays.toString(codigo) +
                '}';
    }
}
