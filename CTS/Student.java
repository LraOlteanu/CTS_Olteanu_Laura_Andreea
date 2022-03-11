package S3.CTS;

public class Student extends Aplicant {
    protected String facultate;
    protected int anStudii;

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public void setAnStudii(Integer anStudii) {
        this.anStudii = anStudii;
    }

    public Student() {
        super();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{Angajat");
        sb.append(super.toString());
        sb.append("Facultate=").append(facultate);
        sb.append(", anStudii=").append(anStudii);
        sb.append("}");
        return sb.toString();
    }
}