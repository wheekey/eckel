package reusingclasses.exercise12;

public class Component1 {
    public Component1(String str) {
        System.out.println(str);
    }

    void dispose()
    {
        System.out.println("Component1 dispose");
    }
}
