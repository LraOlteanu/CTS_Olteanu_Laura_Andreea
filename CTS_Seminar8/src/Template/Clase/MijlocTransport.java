package Template.Clase;

public abstract class MijlocTransport {
protected abstract void opresteStatie1();
    protected abstract void opresteStatie2();
    protected abstract void opresteStatie3();
    protected abstract void opresteStatie4();
    protected abstract void opresteStatie5();
    protected abstract void opresteStatie6();

    public final void parcurgeTraseu(){
        opresteStatie1();
        opresteStatie2();
        opresteStatie3();
        opresteStatie4();
        opresteStatie5();
        opresteStatie6();
    }
    public final void parcurgeTraseuInvers(){
        opresteStatie6();
        opresteStatie5();
        opresteStatie4();
        opresteStatie3();
        opresteStatie2();
        opresteStatie1();
    }

}
