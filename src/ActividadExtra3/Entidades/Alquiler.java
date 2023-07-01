package ActividadExtra3.Entidades;

import java.util.Date;
import ActividadExtra3.Servicios.PeliculaServicio;

public class Alquiler {

    private PeliculaServicio pelSer;
    private Date inicio, fin;
    private static int precio = 10;

    public Alquiler() {
    }

    public Alquiler(PeliculaServicio pelSer, Date inicio, Date fin) {
        this.pelSer = pelSer;
        this.inicio = inicio;
        this.fin = fin;
    }

    public PeliculaServicio getPelSer() {
        return pelSer;
    }

    public Date getInicio() {
        return inicio;
    }

    public Date getFin() {
        return fin;
    }

    public static int getPrecio() {
        return precio;
    }

    public void setPelSer(PeliculaServicio pelSer) {
        this.pelSer = pelSer;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public static void setPrecio(int precio) {
        Alquiler.precio = precio;
    }

    @Override
    public String toString() {
        return "Alquiler - " +
                "Titulo: " + pelSer.getTitulo() +
                ", Inicio: " + inicio +
                ", Fin: " + fin;
    }
}
