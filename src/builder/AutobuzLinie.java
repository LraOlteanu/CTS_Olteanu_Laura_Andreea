package builder;

public class AutobuzLinie {
    private int nrLinie;
    private String numeSofer;
    private boolean deschideUsile;
    private boolean areOprire;
    private String textRulat;
    private String model;
    private int numarCalatori;

    public AutobuzLinie() {
        this.nrLinie = 1;
        this.numeSofer = "Andrei";
        this.deschideUsile = true;
        this.areOprire = true;
        this.textRulat = "Welcome";
        this.model = "Renault";
        this.numarCalatori = 60;
    }

    public void setNrLinie(int nrLinie) {
        this.nrLinie = nrLinie;
    }

    public void setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
    }

    public void setDeschideUsile(boolean deschideUsile) {
        this.deschideUsile = deschideUsile;
    }

    public void setAreOprire(boolean areOprire) {
        this.areOprire = areOprire;
    }

    public void setTextRulat(String textRulat) {
        this.textRulat = textRulat;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumarCalatori(int numarCalatori) {
        this.numarCalatori = numarCalatori;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutobuzLinie{");
        sb.append("nrLinie=").append(nrLinie);
        sb.append(", numeSofer='").append(numeSofer).append('\'');
        sb.append(", deschideUsile=").append(deschideUsile);
        sb.append(", areOprire=").append(areOprire);
        sb.append(", textRulat='").append(textRulat).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", numarCalatori=").append(numarCalatori);
        sb.append('}');
        return sb.toString();
    }
}