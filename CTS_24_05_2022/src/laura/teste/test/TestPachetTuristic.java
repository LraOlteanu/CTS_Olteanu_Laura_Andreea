package laura.teste.test;

import junit.framework.Assert;
import laura.agentie.PachetTuristic;
import laura.teste.categorii.CategorieBoundery;
import laura.teste.categorii.CategorieUtilizareFake;
import laura.teste.dubluri.PersoanaFake;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class TestPachetTuristic {
    @Test
    @Category(CategorieUtilizareFake.class)
    public void testPoateRezervaVarstaEligibila(){
        PersoanaFake persoanaFake= new PersoanaFake();
        PachetTuristic pachetTuristic= new PachetTuristic(persoanaFake, "Saint Tropez", 2000.0);
        persoanaFake.setVarsta(22);
        assertTrue(pachetTuristic.poateRezerva());
    }

    @Test
    @Category(CategorieUtilizareFake.class)
    public void testPoateRezervaVarstaMaiMica(){
        PersoanaFake persoanaFake= new PersoanaFake();
        PachetTuristic pachetTuristic= new PachetTuristic(persoanaFake, "Saint Tropez", 2000.0);
        persoanaFake.setVarsta(16);
        assertFalse(pachetTuristic.poateRezerva());
    }
    @Test
    @Category(CategorieUtilizareFake.class)
    public void testAplicaDiscountVarstnici(){
        PersoanaFake persoanaFake= new PersoanaFake();
        persoanaFake.setVarsta(90);
        PachetTuristic pachetTuristic= new PachetTuristic(persoanaFake, "Roma", 67.7);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(67.7, pachetTuristic.getPret(), 0.01);

    }
    @Test
    @Category({CategorieUtilizareFake.class, CategorieBoundery.class})

    public void testNuAplicaDiscountVarstnici(){
        PersoanaFake persoanaFake= new PersoanaFake();
        persoanaFake.setVarsta(25);
        PachetTuristic pachetTuristic= new PachetTuristic(persoanaFake, "Roma", 67.7);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(67.7, pachetTuristic.getPret(), 0.01);

    }
}
