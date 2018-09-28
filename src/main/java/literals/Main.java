package literals;

public class Main {

    public static void main(String[] args) {
        int i1 = 0x2f; // Hexadecimal (lowercase)
        System.out.println("i1: " + Integer.toBinaryString(i1));

        int i2 = 0X2F; // Hexadecimal (uppercase)
        System.out.println("i2: " + Integer.toBinaryString(i2));

        int i3 = 0177; // Octal (leading zero)
        System.out.println("i3: " + Integer.toBinaryString(i3));

        char c = 0xffff; // max char hex value
        System.out.println("c: " + Integer.toBinaryString(c));

        byte b = 0x7f; // max byte hex value
        System.out.println("b: " + Integer.toBinaryString(b));

        short s = 0x7fff; // max short hex value
        System.out.println("s: " + Integer.toBinaryString(s));

        long n1 = 200L; // long suffix
        System.out.println("n1: " + Long.toBinaryString(n1));

        long n2 = 200l; // long suffix (but can be confusing)
        System.out.println("n2: " + Long.toBinaryString(n2));

        long n3 = 200;
        System.out.println("n3: " + Long.toBinaryString(n3));

        float f1 = 1;
        System.out.println("f1: " + Long.toBinaryString((long) f1));

        float f2 = 1F; // float suffix
        System.out.println("f2: " + Long.toBinaryString((long) f2));

        float f3 = 1f; // float suffix
        System.out.println("f3: " + Long.toBinaryString((long) f3));

        double d1 = 1d; // double suffix
        System.out.println("d1: " + Long.toBinaryString((long) d1));

        double d2 = 1D; // double suffix
        System.out.println("d2: " + Long.toBinaryString((long) d2));

        // (Hex and Octal also work with long)
    }

}
