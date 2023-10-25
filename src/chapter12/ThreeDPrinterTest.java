package chapter12;

public class ThreeDPrinterTest {
    public static void main(String[] args) {
        ThreeDPrinter printer = new ThreeDPrinter();

        Powder p1 = new Powder();
        printer.setMaterial(p1); // 자동 형 변환 (Powder -> Object)

        Powder p2 = (Powder) printer.getMaterial(); // 직접 형 변환 필요(Object -> Powder)
    }
}
