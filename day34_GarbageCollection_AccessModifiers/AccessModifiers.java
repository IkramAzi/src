package day34_GarbageCollection_AccessModifiers;

public class AccessModifiers {

    public static int publicData = 100;

    static int defaultData = 200; // access modifiers : default

    private static int privateData = 300;

    public static void method1(){
        System.out.println("Public");
    }

    public static void method2() {
        System.out.println("Default");
    }

    static void method3() {
        System.out.println("Private");
    }

    private static void main(String[] args) {

        System.out.println(publicData);
        System.out.println(defaultData);
        System.out.println(privateData);
    }
}
