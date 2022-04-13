package Decorator.clase;

public class PrintBilet implements Printer {
    @Override
    public void print() {
        System.out.println("Am printat un bilet");
    }
}
