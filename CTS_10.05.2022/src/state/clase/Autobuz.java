package state.clase;

public class Autobuz {
    private Stare stare;
    private int nrAutobuz;

    public Stare getStare() {
        return stare;
    }

    public void setStare(Stare stare) {
        this.stare = stare;
    }

    public int getNrAutobuz() {
        return nrAutobuz;
    }

    public void setNrAutobuz(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
    }

    public Autobuz(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
        stare=new LaCapatDeLinie();
    }

    public void pleacaInCursa(){
        InCursa inCursa= new InCursa();
        inCursa.actualizeazaStare(this);
    }
    public void intraInService(){
        new LaReparat().actualizeazaStare(this);
    }

    public void ieseDinService(){
        new LaCapatDeLinie().actualizeazaStare(this);
    }

    public void ajungeLaCapat(){
        new LaCapatDeLinie().actualizeazaStare(this);
    }

}
