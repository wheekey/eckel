package reusingclasses.exercise16;

public class Amphibian {

    public void qwaqwa() {
        System.out.println("KVA KVA");
    }

    static void swim(Amphibian amphibian) {
        amphibian.qwaqwa();
    }
}
