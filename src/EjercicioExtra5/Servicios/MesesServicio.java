package EjercicioExtra5.Servicios;

import EjercicioExtra5.Entidades.Meses;

public class MesesServicio {

    public Meses mesScreto() {
        return new Meses((int) (Math.random() * 12));
    }

    public boolean esElMes(Meses _mes, String _intento) {
        return (_mes.getMes().equalsIgnoreCase(_intento));
    }

}
