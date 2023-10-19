package chapter8.inheritance;

public class CustomerTest4 {
    public static void main(String[] args) {
        Customer customerKim = new VIPCustomer(10020, "김유신", 1000);
        customerKim.bonusPoint = 10000;
//        System.out.println(customerKim.showVIPInfo()); // 오류 발생
    }
}
