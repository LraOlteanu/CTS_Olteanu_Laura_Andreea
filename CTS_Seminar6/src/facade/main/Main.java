package facade.main;

import facade.clase.Autobuz;
import facade.clase.Facade;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz();
        Facade.deschideUsi(autobuz);
        Facade.lasaLiberUsi(autobuz);
    }
}