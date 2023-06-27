package EjercicioExtra4.Entidades;

public class NIF {

    private long num;
    private String nif;

    public NIF() {
    }

    public NIF(long num, String nif) {
        this.num = num;
        this.nif = nif;
    }

    public long getNum() {
        return num;
    }

    public String getNif() {
        return nif;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return num + "-" + nif;
    }
}
