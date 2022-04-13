package adapter.main;

import adapter.autobuz.AdapterValidatorObiecte;
import adapter.autobuz.Autobuz;
import adapter.metrou.ValidatorMetrou;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz();
        ValidatorMetrou metrou = new ValidatorMetrou();

        AdapterValidatorObiecte adaptorObiecte = new AdapterValidatorObiecte(metrou);
        adaptorObiecte.validateBilet();
        adaptorObiecte.validareAbonament();
    }
}