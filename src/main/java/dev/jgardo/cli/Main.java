package dev.jgardo.cli;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class Main implements QuarkusApplication {
    @Override
    public int run(String... args) throws Exception {
        System.out.println("Hello " + (args.length > 0 ? args[0]: null));
        return 0;
    }
}
