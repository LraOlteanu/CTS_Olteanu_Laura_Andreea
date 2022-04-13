package adapter.autobuz;

import adapter.metrou.ValidatorMetrou;

public class AdapterValidatorObiecte implements ValidatorAutobuz {
    private ValidatorMetrou validatorMetrou;

    public AdapterValidatorObiecte(ValidatorMetrou validatorMetrou) {
        this.validatorMetrou = validatorMetrou;
    }

    @Override
    public void validareAbonament() {
        validatorMetrou.validareAbonement();
    }

    @Override
    public void validateBilet() {
        validatorMetrou.validareCalatorie();
    }
}