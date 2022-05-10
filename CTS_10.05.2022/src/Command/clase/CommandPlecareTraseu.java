package Command.clase;

public class CommandPlecareTraseu implements  Command{
    private int nrLinie;
    private Autobuz autobuz;

    public CommandPlecareTraseu(int nrLinie, Autobuz autobuz) {
        this.nrLinie = nrLinie;
        this.autobuz = autobuz;
    }

    @Override
    public void executa() {
        autobuz.pleacaInCursa(nrLinie);
    }
}
