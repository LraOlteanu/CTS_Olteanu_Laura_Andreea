package S3.CTS;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Aplicant> listaAngajati;
        AplicantsReader readerAngajati = new AngajatiReader();
        try {
            listaAngajati = readerAngajati.citireAplicanti("angajati.txt");
            for(Aplicant angajat:listaAngajati) {
                angajat.afisareSalariuZilnic(1000);
                angajat.afiseazaStatut();
                System.out.println(angajat);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}