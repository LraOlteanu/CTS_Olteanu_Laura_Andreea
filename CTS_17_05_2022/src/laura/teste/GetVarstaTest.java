package laura.teste;

import laura.clase.Persoana;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GetVarstaTest {
    private Persoana persoana;

    @org.junit.Test
    public void getVarstaRight(){
        persoana= new Persoana("Laura", "6000726133578");
        int varsta= persoana.getVarsta();
        assertEquals(21, varsta);
    }

    @org.junit.Test
    public void getVarstaBoundary_1800(){
        persoana= new Persoana("Laura", "3000101030012");
        int varsta= persoana.getVarsta();
        assertEquals(222, varsta);
    }

    @org.junit.Test
    public void getVarstaBoundary_1899(){
        persoana= new Persoana("Laura", "399123130012");
        int varsta= persoana.getVarsta();
        assertEquals(122, varsta);
    }
    /*@org.junit.Test
    public void getVarstaBoundaryZiuaCurenta(){
        persoana= new Persoana("Laura", "5220517030012");
        int varsta= persoana.getVarsta();
        assertEquals(0, varsta);
    }*/

    @org.junit.Test
    public void getVarstaBoundaryZiuaUrmatoare(){
        persoana= new Persoana("Laura", "5040518030012");
        int varsta= persoana.getVarsta();
        assertEquals(17, varsta);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void getVarstaErrorCondition() {
        persoana = new Persoana("Laura", "6220518567898");
        int varsta = persoana.getVarsta();

    }

    @org.junit.Test(expected = NullPointerException.class)
    public void getVarstaErrorConditionCNP() {
        persoana = new Persoana("Laura", null);
        int varsta = persoana.getVarsta();
    }

    @org.junit.Test(timeout=1000)
    public void getVarstaPerformance() {
        persoana = new Persoana("Laura", "6200510567898");
        int varsta = persoana.getVarsta();
    }

    @org.junit.Test
    public void getVarstaOrder() {
        persoana = new Persoana("Laura", "6200510567898");
        Persoana persoana1= new Persoana("Andreea","6180510567898" );
        assertTrue(persoana1.getVarsta()> persoana.getVarsta());
    }
}
