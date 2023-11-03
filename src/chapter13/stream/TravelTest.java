package chapter13.stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {
    public static void main(String[] args) {
        TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
        TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
        TravelCustomer customerHong = new TravelCustomer("이순신", 13, 50);

        List<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(customerLee);
        customerList.add(customerKim);
        customerList.add(customerHong);

        System.out.println("===== 고객 명단(이름) 출력(추가된 순서대로) =====");
        customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));

        System.out.println("===== 총 여행 비용 =====");
        int totalPrice = customerList.stream().mapToInt(c -> c.getPrice()).sum();
        System.out.println(totalPrice);

        System.out.println("===== 20세 이상 고객 출력(정렬) =====");
        customerList.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));

    }
}
