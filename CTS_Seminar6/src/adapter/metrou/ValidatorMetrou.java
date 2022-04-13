package adapter.metrou;

public class ValidatorMetrou implements ValidatorSubteran {
    @Override
    public void validareCalatorie() {
        System.out.println("Am validat bilet metrou");
    }

    @Override
    public void validareAbonement() {
        System.out.println("Am validat abonament metrou");
    }
}