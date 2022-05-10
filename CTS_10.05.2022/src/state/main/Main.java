package state.main;

import state.clase.Autobuz;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz= new Autobuz(89);

        autobuz.pleacaInCursa();
        autobuz.ieseDinService();
        autobuz.ajungeLaCapat();
        autobuz.intraInService();
        autobuz.ajungeLaCapat();
        autobuz.ieseDinService();
    }
}
