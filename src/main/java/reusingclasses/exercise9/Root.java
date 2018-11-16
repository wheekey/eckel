package reusingclasses.exercise9;

import reusingclasses.exercise8.Main;

public class Root {
    Component1 component1 = new Component1("cmp1");
    Component2 component2 = new Component2("cmp2");
    Component3 component3 = new Component3("cmp3");

    public Root() {
        System.out.println("Root");
    }


}
