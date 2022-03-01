package sources.sem2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentiReader implements AplicantsReader {
    @Override
    public List<Aplicant> citireAplicanti(String numeFisier) throws FileNotFoundException {
        Scanner input = new Scanner(new File(numeFisier));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            Student student = new Student();

            AplicantReader.citireAplicant(input, student);
            int an_studii = input.nextInt();
            String facultate = (input.next()).toString();

            student.setAn_studii(an_studii);
            student.setFacultate(facultate);

            studenti.add(student);
        }
        input.close();
        return studenti;
    }
}