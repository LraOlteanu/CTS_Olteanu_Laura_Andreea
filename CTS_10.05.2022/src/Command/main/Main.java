package Command.main;

import Command.clase.Autobuz;
import Command.clase.Command;
import Command.clase.CommandPlecareTraseu;
import Command.clase.Operator;

public class Main {
    public static void main(String[] args) {
        Operator operator= new Operator();
        Autobuz autobuz= new Autobuz("BMW");
        Autobuz autobuz2= new Autobuz("WW");

        CommandPlecareTraseu commandPlecareTraseu= new CommandPlecareTraseu(78,autobuz );
        operator.invocaComanda(commandPlecareTraseu);
        operator.invocaComanda(new CommandPlecareTraseu(2, autobuz2));
        operator.invocaComanda(new CommandPlecareTraseu(11, autobuz));
        operator.invocaComanda(new CommandPlecareTraseu(22, autobuz2));

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();

    }
}
