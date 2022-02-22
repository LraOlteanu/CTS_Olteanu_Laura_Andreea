package sources.animals;

public class main {
    public static void main(String[] args) {
        ZOO zoo = new ZOO("zoo", new IngrijitorZOO("Laura"));
        Girafa g = new Girafa("Girafa 1");
        Zebra z = new Zebra("Zebra 1");

        Girafa g1 = new Girafa("Girafa 2");
        Zebra z1 = new Zebra("Zebra 2");

        zoo.adaugaAnimal(g);
        zoo.adaugaAnimal(z);
        zoo.adaugaAnimal(g1);
        zoo.adaugaAnimal(z1);

        zoo.hranesteAnimale("Fan");
    }
}