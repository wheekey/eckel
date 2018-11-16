package reusingclasses.exercise22;

final class WithFinals {
    // Identical to "private" alone:
    final void f() {
        System.out.println("WithFinals.f()");
    }
}

//public class Main extends WithFinals {
public class Main {
    public static void main(String[] args) {
        System.out.println(123);
    }
}