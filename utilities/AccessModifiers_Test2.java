package utilities;

import day34_GarbageCollection_AccessModifiers.AccessModifiers;

public class AccessModifiers_Test2 {

    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicData);



        AccessModifiers.method1();
        AccessModifiers.method2();
//        AccessModifiers.method3(); // private is not accessible outside the package
    }
}
