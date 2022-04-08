package prototype;

public class Tramvai implements MijlocTransport{
private String numeVatman;

    @Override
    public String toString() {
        return "Tramvai{" +
                "numeVatman='" + numeVatman + '\'' +
                '}';
    }

    @Override
    public MijlocTransport copiaza() throws CloneNotSupportedException {
        return (MijlocTransport) super.clone() ;
    }
}
