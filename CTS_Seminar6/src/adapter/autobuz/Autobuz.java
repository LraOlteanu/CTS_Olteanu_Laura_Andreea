package adapter.autobuz;

public class Autobuz implements ValidatorAutobuz{
    @Override
    public void validareAbonament() {
        System.out.println("Bilet de autobuz validat");
    }

    @Override
    public void validateBilet() {
        System.out.println("Abonament de autobuz validat");
    }
}