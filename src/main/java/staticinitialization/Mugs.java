package staticinitialization;

import static jdk.nashorn.internal.objects.Global.print;

public class Mugs {
    Mug mug1;
    Mug mug2;
    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        System.out.println("mug1 & mug2 initialized");
    }
    Mugs() {
        System.out.println("Main()");
    }
    Mugs(int i) {
        System.out.println("Main(int)");
    }
    public static void main(String[] args) {
        System.out.println("Inside main()");
        new Mugs();
        System.out.println("new Main() completed");
        new Mugs(1);
        System.out.println("new Main(1) completed");
    }
}
