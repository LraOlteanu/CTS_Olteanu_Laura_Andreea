package singleton.factoryMethod;

import singleton.Familie.MijlocTransport;

public class MainFactory {
    public static  void main (String[] args){

        MijlocTransport autobuz=new AutobuzFactory().createObject("789");
        System.out.println(autobuz.toString());

        MijlocTransport troleibuz=new TroleibuzFactory().createObject("67");

        MijlocTransport tramvai=new TramvaiFactory().createObject("8");

        System.out.println(troleibuz);
        System.out.println(tramvai);

    }
}
