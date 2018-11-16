package reusingclasses.exercise12;

public class Root {
    Component1 component1 = new Component1("cmp1");
    Component2 component2 = new Component2("cmp2");
    Component3 component3 = new Component3("cmp3");

    public Root() {
        System.out.println("Root");
    }

    void dispose()
    {
        component3.dispose();
        component2.dispose();
        component1.dispose();
    }
}
