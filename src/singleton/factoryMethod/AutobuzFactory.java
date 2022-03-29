package singleton.factoryMethod;

import singleton.Familie.Autobuz;
import singleton.Familie.MijlocTransport;

public class AutobuzFactory implements Factory{

    @Override
    public MijlocTransport createObject(String nrInmatriculare) {
        return new Autobuz(nrInmatriculare);
    }
}
