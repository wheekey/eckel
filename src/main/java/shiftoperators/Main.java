package shiftoperators;

public class Main {

    public static void main(String[] args) {
        exercise13();
    }

    public static void exercise11()
    {
        int h = 0x11111111;

        System.out.println(Integer.toBinaryString(h));

        for(int i = 0; i < 28; i++) {
            h >>>= 1;
            System.out.println(Integer.toBinaryString(h));
        }
    }

    static void exercise12()
    {
        int i = -1;

        i <<= 10;

        for (int j = 0; j < 32; j++)
        {
            i >>>= 1;
            System.out.println(Integer.toBinaryString(i));
        }
    }

    static void exercise13()
    {
        char a = 'a';
        char b = 'b';
        char c = 'c';

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(c));
    }

}
