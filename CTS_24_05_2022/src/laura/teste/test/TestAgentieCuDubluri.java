package laura.teste.test;

import laura.agentie.AgentieTurism;
import laura.agentie.PachetTuristic;
import laura.teste.categorii.CategorieBoundery;
import laura.teste.categorii.CategorieUtilizareDummy;
import laura.teste.categorii.CategorieUtilizareFake;
import laura.teste.dubluri.PachetDummy;
import laura.teste.dubluri.PachetFake;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.rules.Timeout;

import static junit.framework.TestCase.assertEquals;

public class TestAgentieCuDubluri {

    @Test
    public void testAdaugaPachet(){
        PachetDummy pachetDummy= new PachetDummy();
        AgentieTurism agentieTurism= new AgentieTurism();

        agentieTurism.adaugaPachet(pachetDummy);
        assertEquals(1, agentieTurism.getNrPacheteTuristice());

    }

    @Test
    public void testCalculeazaPretTotal(){
        PachetFake pachetFake1= new PachetFake();
        PachetFake pachetFake2= new PachetFake();

        pachetFake1.setValoareGetPret(1000);
        pachetFake2.setValoareGetPret(200);
        AgentieTurism agentieTurism= new AgentieTurism();
        agentieTurism.adaugaPachet(pachetFake1);
        agentieTurism.adaugaPachet(pachetFake2);

        assertEquals(1200, agentieTurism.calculareSumaTotalaPachete(), 0.0001);


    }
    @Test
    @Category(CategorieUtilizareDummy.class)
    public void testInverseCalculeazaPretTotal(){
        PachetFake pachetFake1= new PachetFake();
        PachetFake pachetFake2= new PachetFake();
        pachetFake1.setValoareGetPret(1000);
        pachetFake2.setValoareGetPret(200);

        AgentieTurism agentieTurism= new AgentieTurism();
        agentieTurism.adaugaPachet(pachetFake1);
        agentieTurism.adaugaPachet(pachetFake2);

        double total = agentieTurism.calculareSumaTotalaPachete();
        assertEquals(pachetFake1.getPret(), total-pachetFake2.getPret(), 0.0001);

    }
    @Test
    @Category(CategorieBoundery.class)
    public void testBoundaryCalculeazaPretTotal(){
        AgentieTurism agentieTurism= new AgentieTurism();
        double suma=agentieTurism.calculareSumaTotalaPachete();

        assertEquals(0, suma, 0.01);
    }

    @Test(timeout = 100)
    @Category(CategorieUtilizareFake.class)
    public void testPerformanceCalculeazaPrettotal(){
        AgentieTurism agentieTurism= new AgentieTurism();

        for(int i=0; i<100; i++){
          PachetFake pachetFake= new PachetFake();
          pachetFake.setValoareGetPret(1000);
          agentieTurism.adaugaPachet(pachetFake);

        }
       double total = agentieTurism.calculareSumaTotalaPachete();



    }


}
