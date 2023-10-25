package chapter12;

public class GenericPrinterTest {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
        powderPrinter.setMaterial(new Powder());
        Powder powder = powderPrinter.getMaterial();
        System.out.println(powderPrinter);

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
        plasticPrinter.setMaterial(new Plastic());
        Plastic plastic = plasticPrinter.getMaterial();
        System.out.println(plasticPrinter);

        GenericPrinter powderPrinter2 = new GenericPrinter();
        powderPrinter2.setMaterial(new Powder());
        Powder powder2 = (Powder) powderPrinter2.getMaterial();
        System.out.println(powder2);

        GenericPrinter<Object> powderPrinter3 = new GenericPrinter<Object>();
        powderPrinter3.setMaterial(new Powder());
        Powder powder3 = (Powder) powderPrinter3.getMaterial();
        System.out.println(powder3);
    }
}
