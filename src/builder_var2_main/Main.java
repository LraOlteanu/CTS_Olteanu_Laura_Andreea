package builder_var2_main;

import builder.AutobuzBuilder;
import builder.AutobuzLinie;

public class Main {
    public static void main(String[] args) {
        AutobuzBuilder autobuzBuilder = new AutobuzBuilder();
        autobuzBuilder.setNrLinie(2)
                .setAreOprire(false);

        AutobuzLinie autobuz = autobuzBuilder.build();
        AutobuzLinie autobuz1 = autobuzBuilder.build();
        System.out.println(autobuz);
        System.out.println(autobuz1);
    }
}