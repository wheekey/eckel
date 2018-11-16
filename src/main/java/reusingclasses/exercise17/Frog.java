package reusingclasses.exercise17;

public class Frog extends Amphibian {

    public void qwaqwa()
    {
        System.out.println("qwa qwa qwa");
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        Amphibian.swim(frog);
    }
}
