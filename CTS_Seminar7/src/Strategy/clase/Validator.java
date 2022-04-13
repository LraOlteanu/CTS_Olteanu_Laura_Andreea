package Strategy.clase;

public class Validator {
    private ModalitatePlata modalitatePlata;
    private float sumaDePlata;

    public Validator(ModalitatePlata modalitatePlata, float sumaDePlata) {
        this.modalitatePlata = modalitatePlata;
        this.sumaDePlata = sumaDePlata;
    }
    public void setModalitatePlata(ModalitatePlata modalitatePlata){
        this.modalitatePlata=modalitatePlata;
    }

    public void platesteCalatorie(){
        modalitatePlata.plateste(sumaDePlata);
    }
}
