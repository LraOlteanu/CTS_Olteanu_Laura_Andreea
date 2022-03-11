package S3.CTS;

public class Angajat extends Aplicant {
    private String ocupatie;
    private int salariu;

    public Angajat() {
        super();
    }

    public void setOcupatie(String ocupatie) {
        this.ocupatie = ocupatie;
    }

    public void setSalariu(Integer salariu) {
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{Angajat");
        sb.append(super.toString());
        sb.append("Ocupatie=").append(ocupatie);
        sb.append(", salariu=").append(salariu);
        sb.append("}");
        return sb.toString();
    }
}