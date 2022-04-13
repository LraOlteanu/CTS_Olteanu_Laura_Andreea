package facade.clase;

public class Facade {
    public static void deschideUsi(Autobuz autobuz) {
        autobuz.deschideUsaFata();
        autobuz.deschideUsaMijloc();
        autobuz.deschideUsaSpate();
    }

    public static void lasaLiberUsi(Autobuz autobuz) {
        autobuz.lasaLiberUsaFata();
        autobuz.lasaLiberUsaMijloc();
        autobuz.lasaLiberUsaSpate();
    }
}