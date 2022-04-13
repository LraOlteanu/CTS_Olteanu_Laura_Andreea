package _Proxy.proxy.clasa;

public class Autobuz implements MijlocTransport{
    private String numeSofer;
    private int nrLocuri;
    private int nrCalatori;

    public Autobuz(String numeSofer, int nrLocuri, int nrCalatori) {
        this.numeSofer = numeSofer;
        this.nrLocuri = nrLocuri;
        this.nrCalatori = nrCalatori;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "numeSofer='" + numeSofer + '\'' +
                ", nrLocuri=" + nrLocuri +
                ", nrCalatori=" + nrCalatori +
                '}';
    }



    public int getNrCalatori() {
        return nrCalatori;
    }

    @Override
    public void opresteInStatie() {
        System.out.println("Autobuzul a oprit in statia cu "+this.nrCalatori+ " calatori.");
    }
}
