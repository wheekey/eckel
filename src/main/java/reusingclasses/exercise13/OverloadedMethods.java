package reusingclasses.exercise13;

public class OverloadedMethods {

    public void overloadedMethod(String str1)
    {
        System.out.println(str1);
    }

    public void overloadedMethod(String str1, String str2)
    {
        System.out.println(str1);
        System.out.println(str2);
    }

    public void overloadedMethod(String str1, String str2, String str3)
    {
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
