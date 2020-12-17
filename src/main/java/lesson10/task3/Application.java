package lesson10.task3;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {
        Generator gen=new FileGen(1);

        gen.generate();
    }
}
