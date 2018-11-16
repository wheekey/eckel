package reusingclasses.exercise12;

public class Component2 {
    public Component2(String str) {
        System.out.println(str);
    }

    void dispose()
    {
        System.out.println("Component2 dispose");
    }
}
