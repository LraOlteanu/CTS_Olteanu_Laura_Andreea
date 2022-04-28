package Template.Main;

import Template.Clase.Tramvai;
import Template.Clase.TramvaiProbe;

public class Main {
    public static void main(String[] args) {
        Tramvai tramvai= new Tramvai();
        tramvai.parcurgeTraseu();
        tramvai.parcurgeTraseuInvers();
    }
}
