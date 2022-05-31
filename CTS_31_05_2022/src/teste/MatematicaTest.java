package teste;

import clase.Matematica;
import clase.NumitorIncorectExceptie;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class MatematicaTest {
    @Test
    public void testSumaPerformance() {
        Matematica matematica=new Matematica();

        assertTimeout(Duration.ofMillis(100), new org.junit.jupiter.api.function.Executable() {

            @Override
            public void execute() throws Throwable {
                matematica.suma(4, 5);

            }
        });
    }

    @Test
    public void testSumaRight() {
        Matematica matematica=new Matematica();
        assertEquals(10, matematica.suma(2, 8));
    }

    //1143+4345
    @Test
    public void testSumaInverse() {
        Matematica matematica=new Matematica();
        int rezultatSuma=matematica.suma(1143, 4345);
        int aflarePrinParametru=rezultatSuma -4345;
        assertEquals(1143, aflarePrinParametru);
    }

    @Test
    public void testRaportRight() {
        Matematica matematica=new Matematica();
        assertEquals(6, matematica.raport(24, 4), 0.0);
    }

    @Test
    public void testRaportBounderyInferior() {
        Matematica matematica=new Matematica();
        assertEquals(-10, matematica.raport(10, -1));
    }

    @Test
    public void testRaportBounderySuperior() {
        Matematica matematica=new Matematica();
        assertEquals(10, matematica.raport(10, 1));
    }

    @Test
    public void testRaportExceptie() {
        Matematica matematica=new Matematica();
        assertThrows(NumitorIncorectExceptie.class, new org.junit.jupiter.api.function.Executable() {
            @Override
            public void execute() throws Throwable{
                matematica.raport(10, 0);
            }
        });
    }


}