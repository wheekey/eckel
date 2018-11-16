package reusingclasses.exercise13;

import reusingclasses.exercise3.Cartoon;

public class OverloadedMethodsExtended extends OverloadedMethods {

    public void overloadedMethod(String str1, String str2, String str3, String str4) {
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }

    public static void main(String[] args) {
        OverloadedMethodsExtended overloadedMethodsExtended = new OverloadedMethodsExtended();
        overloadedMethodsExtended.overloadedMethod("str1");
        overloadedMethodsExtended.overloadedMethod("str1", "str2");
        overloadedMethodsExtended.overloadedMethod("str1", "str2", "str3");
        overloadedMethodsExtended.overloadedMethod("str1", "str2", "str3", "str4");
    }
}
