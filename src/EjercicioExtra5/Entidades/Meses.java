package EjercicioExtra5.Entidades;

public class Meses {

    private static final String[] meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    private String mes;

    public Meses() {
    }

    public Meses(int mes) {
        this.mes = meses[mes];
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return "Mes Secreto: " + mes;
    }
}
