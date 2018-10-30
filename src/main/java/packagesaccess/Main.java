package packagesaccess;

import packagesaccess.subpackage.Subclass;
import packagesaccess.subpackage.SubclassCaller;

public class Main {

    public static void main(String[] args) {
        Subclass subclass = new Subclass();
        //subclass.callProtectedMethod();

        SubclassCaller subclassCaller = new SubclassCaller();
        subclassCaller.callSubclassProtectedMethod();
    }

}
