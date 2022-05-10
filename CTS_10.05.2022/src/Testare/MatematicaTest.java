package Testare;

import org.junit.Test;

import static org.junit.Assert.*;

public class MatematicaTest {


    @Test
    public void testeazaSuma(){
        Matematica matematica= new Matematica();
        int rezultatObtinut= matematica.suma(8, 8);
        assertEquals(16, rezultatObtinut);
    }

    @Test
    public void testeazaRaport(){
        Matematica matematica1= new Matematica();
        double rezultatObtinut= matematica1.raport(24, 6);
        assertEquals(4, rezultatObtinut, 0.001);
    }
    @Test
    public void testRaportShouldThrowException(){
       try{
           Matematica matematica1= new Matematica();
           matematica1.raport(5, 0);
           fail("Nu trebuie sa ajung aici!!");
       }
       catch(IllegalArgumentException exception){

       }
    }

}