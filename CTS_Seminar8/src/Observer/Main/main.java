package Observer.Main;


import Observer.clase.Autobuz;
import Observer.clase.Calator;
import Observer.clase.Observer;
import Observer.clase.Subiect;

public class main {
    public static void main(String[] args) {
        Subiect a1= new Autobuz(32);

        Observer calator1= new Calator("Mihai");
        Observer calator2= new Calator("Denis");
        Observer calator3= new Calator("Razvan");


        a1.adaugaCatatori((calator1));
        a1.adaugaCatatori((calator2));
        a1.adaugaCatatori((calator3));

    }
}
