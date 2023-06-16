package ActividadExtra2.Entidades;

public class Figura {
    private int medida1, medida2, id;
    private String tipo;

    public Figura() {
    }

    public Figura(int medida1, int medida2, int id, String tipo) {
        this.medida1 = medida1;
        this.medida2 = medida2;
        this.id = id;
        this.tipo = tipo;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMedida1() {
        return this.medida1;
    }

    public void setMedida1(int medida1) {
        this.medida1 = medida1;
    }

    public int getMedida2() {
        return this.medida2;
    }

    public void setMedida2(int medida2) {
        this.medida2 = medida2;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}