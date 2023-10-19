package chapter8.inheritance;

public class OverridingTest3 {
    public static void main(String[] args) {
        int price = 10000;

        Customer customer1 = new Customer(10010, "이순신");
        VIPCustomer customer2 = new VIPCustomer(10020, "김유신", 1000);
        Customer customer3 = new VIPCustomer(10030, "나몰라", 2000);

        System.out.println(customer1.getCustomerName() + "님이 지불해야 하는 금액은 " + customer1.calcPrice(price) + "입니다.");
        System.out.println(customer2.getCustomerName() + "님이 지불해야 하는 금액은 " + customer2.calcPrice(price) + "입니다.");
        System.out.println(customer3.getCustomerName() + "님이 지불해야 하는 금액은 " + customer3.calcPrice(price) + "입니다.");
    }
}
