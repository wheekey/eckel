package reusingclasses.exercise5;

import reusingclasses.exercise3.Cartoon;

public class C extends A {
    public B b = new B("bshnyy");

    public C(String str) {
        super(str);
    }

    public static void main(String[] args) {
        C x = new C("cshnyy");
    }
}
