package reusingclasses.exercise16;

public class Frog extends Amphibian {

    public static void main(String[] args) {
        Frog frog = new Frog();
        Amphibian.swim(frog);
    }
}
