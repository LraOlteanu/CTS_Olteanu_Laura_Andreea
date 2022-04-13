package composite.main;

import composite.clase.Autobuz;
import composite.clase.Flota;
import composite.clase.Nod;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz1 = new Autobuz("BMW", "E445", 75);
        Autobuz autobuz2 = new Autobuz("Mercedes", "f567", 67);
        Autobuz autobuz3 = new Autobuz("eee", "vdg", 87);
        Autobuz autobuz4 = new Autobuz("Otokar", "F-43", 87);
        Autobuz autobuz5 = new Autobuz("bbb", "dsd", 234);
        Autobuz autobuz6 = new Autobuz("Mercedes", "ds4", 65);

        Nod mari = new Flota("Autobuze mari");
        Nod medii = new Flota("Autobuze medii");
        Nod mici = new Flota("Autobuze mici");

        Nod flota = new Flota("flota");

        try {
            mici.adaugaNod(autobuz2);
            mici.adaugaNod(autobuz6);

            medii.adaugaNod(autobuz4);
            medii.adaugaNod(autobuz1);

            mari.adaugaNod(autobuz5);
            mari.adaugaNod(autobuz3);

            flota.adaugaNod(mici);
            flota.adaugaNod(medii);
            flota.adaugaNod(mari);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Intreaga flota: " + flota.calculeazaSumaGarantie(2));
        System.out.println("Flota medie: " + medii.calculeazaSumaGarantie(2));
    }
}