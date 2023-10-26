package chapter12.generics;

public class Plastic extends Material implements Material2 {
    public void doPrinting() {
        System.out.println("Plastic 재료로 출력합니다.");
    }

    public String toString() {
        return "재료는 Plastic입니다.";
    }

    @Override
    public void doPrinting2() {
        Material2.super.doPrinting2();
        System.out.println("Plastic - doPrinting2() 재정의");
    }
}
