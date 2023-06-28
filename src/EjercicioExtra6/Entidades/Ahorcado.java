package EjercicioExtra6.Entidades;

import java.util.Arrays;

public class Ahorcado {

    private String[] palabra;
    private boolean[] aciertos;
    private int vidas;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, boolean[] aciertos, int vidas) {
        this.palabra = palabra;
        this.aciertos = aciertos;
        this.vidas = vidas;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public boolean[] getAciertos() {
        return aciertos;
    }

    public int getVidas() {
        return vidas;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public void setAciertos(boolean[] aciertos) {
        this.aciertos = aciertos;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    @Override
    public String toString() {
        return "Ahorcado{" +
                "palabra=" + Arrays.toString(palabra) +
                ", aciertos=" + Arrays.toString(aciertos) +
                ", vidas=" + vidas +
                '}';
    }
}
