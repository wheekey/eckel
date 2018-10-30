package packagesaccess.subpackage;

public class SubclassCaller {
    public void callSubclassProtectedMethod()
    {
        Subclass subclass = new Subclass();
        subclass.callProtectedMethod();
    }
}
