package singleton;

import singleton.Familie.MijlocTransport;

public class main {
    public static  void main(String[] args) {
        Singleton s = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s);
        System.out.println(s2);
        Factory fabrica=new Factory();
        MijlocTransport a= fabrica.createObject(TipTransport.AUTOBUZ, "B100");
        MijlocTransport b= fabrica.createObject(TipTransport.TRAMVAI, "B120");
        MijlocTransport c= fabrica.createObject(TipTransport.TROLEIBUZ, "B140");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

}

