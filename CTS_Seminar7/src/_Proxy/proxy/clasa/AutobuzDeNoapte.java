package _Proxy.proxy.clasa;

public class AutobuzDeNoapte implements MijlocTransport{
    Autobuz autobuz;

    public AutobuzDeNoapte(Autobuz autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opresteInStatie() {
        if(autobuz.getNrCalatori() >0){
            autobuz.opresteInStatie();
        }
        else{
            System.out.println("Nu exista calatori");
        }
    }
}
