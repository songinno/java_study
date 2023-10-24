package chapter10.interfaceex;

public class CustomerTest2 {
    public static void main(String[] args) {
        Buy buyer = new Customer();
        Sell seller = new Customer();
        Customer customer = new Customer();

        buyer.order();
        seller.order();
        customer.order();
    }
}
