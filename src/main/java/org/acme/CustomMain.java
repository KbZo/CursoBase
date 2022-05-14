package org.acme;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class CustomMain {
    public static void main(String[] args) {
        System.out.println("Running main method");
        //Quarkus.run(args);
        Quarkus.run(CustomApp.class, args);
    }

    //Crear logica de negocio para no implementarla en un metodo main
    public static class CustomApp implements QuarkusApplication {

        @Override
        public int run(String... args) throws Exception {
            System.out.println("Running main method from  customApp");
            Quarkus.waitForExit();
            return 0;
        }
    }

}
