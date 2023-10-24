package chapter10.interfaceex;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buy();
        customer.sell();

        System.out.println("----------------------");

        Buy buyer = customer;
        buyer.buy();

        Sell seller = customer;
        seller.sell();

        System.out.println("----------------------");

        if (buyer instanceof Customer) {
            Customer customer3 = (Customer) buyer;
            customer3.buy();
            customer3.sell();
        }

        System.out.println("----------------------");

        if (seller instanceof Customer) {
            Customer customer2 = (Customer) seller;
            customer2.buy();
            customer2.sell();
        }

        Buy.pay();
        Sell.pay();
    }
}
