package sources.animals;

import java.util.ArrayList;
import java.util.List;

public class ZOO {
    private String nume;
    private IngrijitorZOO ingrijitorZOO;
    private List<Animal> animale;
    public ZOO(String nume, IngrijitorZOO ingrijitorZOO) {
        this.nume = nume;
        this.ingrijitorZOO = ingrijitorZOO;
        this.animale = new ArrayList<Animal>();

    }



    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public IngrijitorZOO getIngrijitorZOO() {
        return ingrijitorZOO;
    }

    public void setIngrijitorZOO(IngrijitorZOO ingrijitorZOO) {
        this.ingrijitorZOO = ingrijitorZOO;
    }

    public void adaugaAnimal(Animal animal)
    {
        animale.add(animal);
    }

    public void hranesteAnimale(String mancare)
    {
        for (Animal a : animale)
        {
            ingrijitorZOO.hranesteAnimal(a, mancare);
        }

    }
}