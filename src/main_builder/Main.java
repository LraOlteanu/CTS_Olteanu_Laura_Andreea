package main_builder;

import builder.AutobuzBuilder;
import builder.AutobuzLinie;

public class Main {
    public static void main(String[] args) {
        AutobuzBuilder autobuzBuilder = new AutobuzBuilder();
        autobuzBuilder.setNumeSofer("Sofer CTS");
        autobuzBuilder.setTextRulat("END LINE");
        AutobuzLinie autobuzLinie = autobuzBuilder.build();

        System.out.println(autobuzLinie);
    }
}