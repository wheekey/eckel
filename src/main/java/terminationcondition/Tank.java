package terminationcondition;

public class Tank {
    int howFull = 0;
    Tank() { this(0); }
    Tank(int fullness) {
        howFull = fullness;
    }
    void sayHowFull() {
        if(howFull == 0) System.out.println("Tank is empty");
        else System.out.println("Tank filling status = " + howFull);
    }
    void empty() {
        howFull = 0;
    }
    protected void finalize() {
        if(howFull != 0)
            System.out.println("Error: Tank not empty" + howFull);
        // Normally, you'll also do this:
        // super.finalize(); // Call the base-class version
    }
}
