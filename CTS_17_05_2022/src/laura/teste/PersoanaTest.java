package laura.teste;

import laura.clase.Persoana;

import static org.junit.Assert.*;

public class PersoanaTest {
    private Persoana persoana;

    @org.junit.Before
    public void setUp() throws Exception{

    }

    @org.junit.Test
    public void getSexRight(){
        persoana= new Persoana("Laura", "2234567891012");
        String sex= persoana.getSex();
        assertEquals("F", sex);

    }

    @org.junit.Test
    public void getSexBoundary(){
        persoana= new Persoana("Laura", "6000051678910");
        String sex= persoana.getSex();
        assertEquals("F", sex);
    }

    @org.junit.Test
    public void getSexCrossCheck(){
        persoana= new Persoana("Laura", "5000051678910");
        int primaCifra= persoana.getCNP().charAt(0);
        String sex= persoana.getSex();
        int cifra;
        if(sex =="M"){
            cifra=1;
        }
        else{
            cifra=2;
        }
        assertEquals(cifra % 2 == 1, primaCifra %2== 1);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void getSexErrorCondition(){
        persoana= new Persoana("Laura", "0000051678910");
        String sex= persoana.getSex();

    }

    @org.junit.Test(timeout= 10)
    public void getSexPerformance(){
        persoana= new Persoana("Laura", "6000051678910");
        String sex= persoana.getSex();

    }
    @org.junit.Test
    public void getSexOutPutFormat(){
        persoana= new Persoana("Laura", "6000051678910");
        String sex= persoana.getSex();
        assertEquals(1, sex.length());

    }

    @org.junit.Test
    public void getSexRangeBetween1800_1899(){
        persoana= new Persoana("Laura", "4888051678910");
        String sex= persoana.getSex();
        assertEquals("F", sex);
    }

    @org.junit.Test(expected = NullPointerException.class)
    public void getSexExistance(){
        persoana= new Persoana("Laura", null);
        String sex= persoana.getSex();
        assertEquals("F", sex);
    }





}