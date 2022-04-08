package main_prototype;

import prototype.Autobuz;
import prototype.MijlocTransport;

public class main {
    public static void main (String[] args)  {
        MijlocTransport autobuz= new Autobuz("Dorian");
        try {
            MijlocTransport autobuz1= autobuz.copiaza();
            System.out.println(autobuz.toString() + "\n"+ autobuz1.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
