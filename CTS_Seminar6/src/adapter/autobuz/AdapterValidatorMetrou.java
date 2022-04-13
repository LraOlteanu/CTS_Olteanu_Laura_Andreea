package adapter.autobuz;

import adapter.metrou.ValidatorMetrou;

public class AdapterValidatorMetrou extends ValidatorMetrou implements ValidatorAutobuz{
    @Override
    public void validareAbonament() {
        super.validareAbonement();
    }

    @Override
    public void validateBilet() {
        super.validareCalatorie();
    }
}