package chapter12.generics;

public class Powder extends Material implements Material2 {
    public void doPrinting() {
        System.out.println("Powder 재료로 출력합니다.");
    }

    public String toString() {
        return "재료는 Powder입니다.";
    }

    @Override
    public void doPrinting2() {
        Material2.super.doPrinting2();
        System.out.println("Powder - doPrinting2() 재정의");
    }
}
