package reusingclasses.exercise11;

class Cleanser {
    private String s = "Cleanser";
    public void append(String a) { s += a; }
    public void dilute() { append(" dilute()"); }
    public void apply() { append(" apply()"); }
    public void scrub() { append(" scrub()"); }
    public String toString() { return s; }
    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute(); x.apply(); x.scrub();
        System.out.println(x);
    }
}
public class Detergent  {
    Cleanser cleanser = new Cleanser();
    // Change a method:
    public void scrub() {
        append(" Detergent.scrub()");
        cleanser.scrub(); // Call base-class version
    }
    public String toString()
    {
        return cleanser.toString();
    }
    // Add methods to the interface:
    public void foam() { append(" foam()"); }
    // Test the new class:
    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class:");
        Cleanser.main(args);
    }

    public void append(String a)
    {
        cleanser.append(a);
    }

    public void dilute()
    {
        cleanser.dilute();
    }

    public void apply()
    {
        cleanser.apply();
    }


}
