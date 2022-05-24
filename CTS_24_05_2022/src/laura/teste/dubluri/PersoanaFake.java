package laura.teste.dubluri;

import laura.persoana.IPersoana;

public class PersoanaFake implements IPersoana {
    private String sex;
    private int varsta;
    private boolean isCNP;

    public PersoanaFake() {

    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setCNP(boolean CNP) {
        isCNP = CNP;
    }

    @Override
    public String getSex() {
        return sex;
    }

    @Override
    public int getVarsta() {
        return varsta;
    }

    @Override
    public boolean checkCNP() {
        return isCNP;
    }
}
