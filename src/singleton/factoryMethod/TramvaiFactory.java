package singleton.factoryMethod;

import singleton.Familie.MijlocTransport;
import singleton.Tramvai;

public class TramvaiFactory implements Factory{

    @Override
    public MijlocTransport createObject(String nrInmatriculare) {
        return new Tramvai(nrInmatriculare);
    }
}
