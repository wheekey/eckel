package reusingclasses.exercise8;

public class SecondClass extends Main {

    String str;

    public SecondClass() {
        super("123");
        System.out.println("Base second class constructor");
    }

    public SecondClass(String str) {
        super(str);
        this.str = str;
        System.out.println("Base second class constructor" + str);
    }

    public static void main(String[] args) {
        Main main = new Main("main");
    }
}
