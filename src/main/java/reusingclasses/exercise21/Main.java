package reusingclasses.exercise21;

class WithFinals {
    // Identical to "private" alone:
     final void f() {
        System.out.println("WithFinals.f()");
    }
}

class OverridingPrivate extends WithFinals {

    /*  final void f() {
        System.out.println("OverridingPrivate.f()");
    }*/
}


public class Main {
    public static void main(String[] args) {

    }
}