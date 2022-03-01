package sources.sem2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiReader implements AplicantsReader {
    @Override
    public List<Aplicant> citireAplicanti(String numeFisier) throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(numeFisier));
        input2.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
            Angajat angajat = new Angajat();

            AplicantReader.citireAplicant(input2, angajat);
            int salariu = input2.nextInt();
            String ocupatie = input2.next();

            angajat.setSalariu(salariu);
            angajat.setOcupatie(ocupatie);

            angajati.add(angajat);
        }
        input2.close();
        return angajati;
    }
}