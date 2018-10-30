package packagesaccess.task3;

import packagesaccess.subpackage.Subclass;
import packagesaccess.subpackage.SubclassCaller;

public class Main {

    public static void main(String[] args) {
        SecondClass secondClass = new SecondClass();
        secondClass.getProtectedString();
    }

}

class SecondClass{

    protected String protectedString = "protectedString";

    protected void getProtectedString()
    {
        System.out.println(protectedString);
    }
}
