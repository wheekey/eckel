package packagesaccess.task2;

public class TestClass {
    public String publicString = "publicString";
    protected String protectedString = "publicString";
    private String privateString = "privateString";
    String packageAccessString = "packageAccessString";

    private void getPrivateMethodCall() {
        System.out.println("getPrivateMethodCall");
    }

    void getPackageMethodCall() {
        System.out.println("getPackageMethodCall");
    }

    protected void getProtectedMethodCall() {
        System.out.println("getProtectedMethodCall");
    }

    public void getPublicMethodCall() {
        System.out.println("getPublicMethodCall");
    }

}
