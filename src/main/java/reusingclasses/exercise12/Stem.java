package reusingclasses.exercise12;

public class Stem extends Root {
    Component1 component1 = new Component1("cmp1");
    Component2 component2 = new Component2("cmp2");
    Component3 component3 = new Component3("cmp3");

    public Stem(String str) {
        System.out.println(str);
    }

    void dispose() {
        System.out.println("Dispose stem");

        component3.dispose();
        component2.dispose();
        component1.dispose();
        super.dispose();

    }

    public static void main(String[] args) {
        Stem stem = new Stem("stem");

        try {
        } finally {
            stem.dispose();
        }
    }
}
