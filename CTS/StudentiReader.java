package S3.CTS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentiReader implements AplicantsReader {
    @Override
    public List<Aplicant> citireAplicanti(String numeFisier) throws FileNotFoundException {
        Scanner input = new Scanner(new File(numeFisier));
        input.useDelimiter(",");
        List<Aplicant> studenti = citireAplicantiDinScanner(input);

        input.close();
        return studenti;
    }

    private List<Aplicant> citireAplicantiDinScanner (Scanner scanner) {
        List<Aplicant> studenti = new ArrayList<>();

        while (scanner.hasNext()) {
            Student student = new Student();

            AplicantReader.citireAplicant(scanner, student);
            int an_studii = scanner.nextInt();
            String facultate = (scanner.next());

            student.setAnStudii(an_studii);
            student.setFacultate(facultate);

            studenti.add(student);
        }
        return studenti;
    }
}

