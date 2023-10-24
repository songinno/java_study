package chapter10.interfaceex;

public class MyClassTest {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.x();
        myClass.y();
        myClass.myMethod();

        X x = myClass;
        x.x();

        Y y = myClass;
        y.y();

        MyInterface myInterface = myClass;
        myInterface.x();
        myInterface.y();
        myInterface.myMethod();
    }
}
