package chapter12.generics;

public interface Material2 {
    void doPrinting();

    default void doPrinting2() {
        System.out.println("doPrinting2()");
    }
}
