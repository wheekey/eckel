package packagesaccess.task2;

import packagesaccess.subpackage.Subclass;
import packagesaccess.subpackage.SubclassCaller;

public class Main {

    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        System.out.println(testClass.protectedString);
        System.out.println(testClass.packageAccessString);
        System.out.println(testClass.publicString);
        //System.out.println(testClass.privateString);

        testClass.getPackageMethodCall();
        testClass.getProtectedMethodCall();
        testClass.getPublicMethodCall();
       // testClass.getPrivateMethodCall();


    }

}
