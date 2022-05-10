package state.clase;

public class LaReparat implements Stare{

    @Override
    public void actualizeazaStare(Autobuz autobuz) {
        if(autobuz.getStare() instanceof LaCapatDeLinie){
            System.out.println("Autobuzul " + autobuz.getNrAutobuz() + " a plecat la reparat");
            autobuz.setStare(this);
        }
        else{
            {
                System.out.println("Autobuzul " + autobuz.getNrAutobuz() + " NU poate intra in service");
            }
        }
    }
}
