package EjercicioExtra1.Servicios;

import EjercicioExtra1.Entidades.Cancion;

public class CancionServicio {

    public Cancion agregarCancion(String _titulo, String _autor) {

        Cancion _cancion = new Cancion(_titulo,_autor);

        return _cancion;
    }
}
