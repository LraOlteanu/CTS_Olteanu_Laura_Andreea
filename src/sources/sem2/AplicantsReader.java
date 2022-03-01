package sources.sem2;

import java.io.FileNotFoundException;
import java.util.List;

public interface AplicantsReader {
    List<Aplicant> citireAplicanti(String numeFisier) throws FileNotFoundException;
}