package laura.teste.dubluri;

import laura.agentie.PachetTuristic;
import laura.persoana.IPersoana;

public class PachetDummy extends PachetTuristic {


    public PachetDummy(IPersoana client, String destinatie, Double pret) {
        super(client, destinatie, pret);
    }

    public PachetDummy() {
        super();

    }
}
