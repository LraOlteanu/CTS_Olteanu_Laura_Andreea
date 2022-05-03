package Memento.main;

import Memento.clase.Autobuz;
import Memento.clase.Manager;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz= new Autobuz("Adrian", 6.78, 21, "Audi", 2010);
        System.out.println(autobuz.toString());

        Manager manager= new Manager();
        manager.addMemento(autobuz.creazaMemento());

        autobuz.setNumeSofer("Adrian");
        autobuz.setConsumMediu(6.78);

        manager.addMemento(autobuz.creazaMemento());

        System.out.println(autobuz.toString());
        autobuz.setNumeSofer("Sof2");
        System.out.println(autobuz.toString());
        autobuz.revenireMemento(manager.getMemento(0));
        System.out.println(autobuz.toString());
    }
}
