package singleton.factoryMethod;

import singleton.Familie.MijlocTransport;
import singleton.Troleibuz;

public class TroleibuzFactory implements Factory{

    @Override
    public MijlocTransport createObject(String nrInmatriculare) {
        return new Troleibuz(nrInmatriculare);
    }
}
