package ChainOfResponsability.clase;

public class TramvaiHandler extends Handler {
    public TramvaiHandler(int limita) {
        super(limita);
    }

    @Override
    public void afisareRecomandare(int distanta) {
        if (distanta < limita) {
            System.out.println("Recomandarea dvs este sa folositi tramvai");
        } else {
            super.nextHandler.afisareRecomandare(distanta);
        }
    }
}
