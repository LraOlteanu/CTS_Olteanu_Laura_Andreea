package _Proxy.proxy.main;

import _Proxy.proxy.clasa.Autobuz;
import _Proxy.proxy.clasa.AutobuzDeNoapte;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz= new Autobuz("Andrei", 56, 23);
        autobuz.opresteInStatie();

        Autobuz autobuz1= new Autobuz("Laurentiu", 56, 0);
        autobuz1.opresteInStatie();

        AutobuzDeNoapte autobuzDeNoapte= new AutobuzDeNoapte(autobuz1);
        autobuzDeNoapte.opresteInStatie();

    }
}
