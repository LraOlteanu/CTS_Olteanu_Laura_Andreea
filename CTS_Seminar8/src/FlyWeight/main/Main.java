package FlyWeight.main;

import FlyWeight.clase.Autobuz;
import FlyWeight.clase.FabricaLinie;
import FlyWeight.clase.Linie;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1= new Autobuz("Mercedes", 2000, 70);
        Autobuz autobuz2= new Autobuz("Audi", 2019, 56);
        Autobuz autobuz3= new Autobuz("Mercedes", 1999, 78);
        Autobuz autobuz4= new Autobuz("WW", 2020, 99);

        FabricaLinie fabricaLinie= new FabricaLinie();
       fabricaLinie.getLinie(133).afiseazaDetaliiAutobuzLinie(autobuz1);
       fabricaLinie.getLinie(133).afiseazaDetaliiAutobuzLinie(autobuz3);

        fabricaLinie.getLinie(182).afiseazaDetaliiAutobuzLinie(autobuz2);
        fabricaLinie.getLinie(182).afiseazaDetaliiAutobuzLinie(autobuz4);
    }
}
