package builder_var2;

class AutobuzLinie {
    private int nrLinie;
    private String numeSofer;
    private boolean deschideUsile;
    private boolean areOprire;
    private String textRulat;
    private String model;
    private int numarCalatori;

    public AutobuzLinie(int nrLinie, String numeSofer, boolean deschideUsile,
                        boolean areOprire, String textRulat, String model, int numarCalatori) {
        this.nrLinie = nrLinie;
        this.numeSofer = numeSofer;
        this.deschideUsile = deschideUsile;
        this.areOprire = areOprire;
        this.textRulat = textRulat;
        this.model = model;
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