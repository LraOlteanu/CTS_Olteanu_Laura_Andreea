package Decorator.main;

import Decorator.clase.DecoratorAbstract;
import Decorator.clase.DecoratorConcret;
import Decorator.clase.PrintBilet;
import Decorator.clase.Printer;

public class Main {
    public static void main(String[] args) {
        Printer printBilet= new PrintBilet();
        printBilet.print();

        DecoratorAbstract decoratorAbstract= new DecoratorConcret(printBilet, "La multi ani!");
        decoratorAbstract.print();
        decoratorAbstract.printeazaMesaj();
    }
}
