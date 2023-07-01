package ActividadExtra3.Servicios;

import java.util.Date;
import ActividadExtra3.Entidades.Alquiler;

public class AlquilerServicio {

    Alquiler alquiler = new Alquiler();

    public Alquiler crearAlquiler(PeliculaServicio _pelSer) {

        alquiler.setPelSer(_pelSer);

        Date hoy = new Date();
        alquiler.setInicio(hoy);

        return alquiler;
    }

    public void terminarAlquiler(Date fecha) {
        alquiler.setFin(fecha);
    }

    public PeliculaServicio getPelSer() {
        return alquiler.getPelSer();
    }

    public Date getFechaFin() {
        return alquiler.getFin();
    }

    public Date getFechaInicio() {
        return alquiler.getInicio();
    }

    public int getPrecioAlq() {
        return alquiler.getPrecio();
    }

}