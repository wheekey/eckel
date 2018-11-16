package reusingclasses.exercise12;

public class Component3 {
    public Component3(String str) {
        System.out.println(str);
    }

    void dispose()
    {
        System.out.println("Component3 dispose");
    }
}
