package Memento.clase;

import java.util.ArrayList;
import java.util.List;

public class Manager {
   private  List<MementoAutobuz> listaMemento;

    public Manager() {
        this.listaMemento = new ArrayList<>();
    }

    public void addMemento(MementoAutobuz mementoAutobuz){
        this.listaMemento.add(mementoAutobuz);
    }

    public MementoAutobuz getMemento(int index){
        return listaMemento.get(index);
    }
}
