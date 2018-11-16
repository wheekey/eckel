package reusingclasses.exercise19;

import java.util.Random;

public class Main {
    private final String name;

    public Main(String s) {
        name = s;
    }

    public Main()
    {
        name = "123";
    }

    public static void main(String[] args) {
        Main main = new Main("str1");
        Main main2 = new Main();
       // main2.name = "123";
    }
}