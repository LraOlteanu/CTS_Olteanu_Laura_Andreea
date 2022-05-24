package laura.teste.dubluri;

import laura.agentie.IPachetTuristic;

public class PachetFake extends PachetDummy {
    private boolean valoarePoateRezerva;
    private double valoareGetPret;

    public PachetFake() {

    }

    public PachetFake(boolean valoarePoateRezerva, double valoareGetPret) {
        this.valoarePoateRezerva = valoarePoateRezerva;
        this.valoareGetPret = valoareGetPret;
    }

    public void setValoarePoateRezerva(boolean valoarePoateRezerva) {
        this.valoarePoateRezerva = valoarePoateRezerva;
    }

    public void setValoareGetPret(double valoareGetPret) {
        this.valoareGetPret = valoareGetPret;
    }

    @Override
    public boolean poateRezerva() {
        return valoarePoateRezerva;
    }

    @Override
    public void aplicaDiscountVarstnici(int procent) {

    }

    @Override
    public Double getPret() {
        return valoareGetPret;
    }
}
