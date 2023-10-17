package chapter5;

import java.util.Date;

public class Order {
    Long orderNum;
    String ordererID;
    Date orderDate;
    String ordererName;
    String productNum;
    String shippingAddress;

    public static void main(String[] args) {
        Order order = new Order();
        order.orderNum = 201803120001L;
        order.ordererID = "abc123";
        order.orderDate = new Date(2018,3,12);
        order.ordererName = "홍길순";
        order.productNum = "PD0345-12";
        order.shippingAddress = "서울시 영등포구 여의도동 20번지";

        System.out.println("주문 번호: " + order.orderNum);
        System.out.println("주문자 아이디: " + order.ordererID);
        System.out.println("주문 날짜: " + order.orderDate.getYear() + "년 " + order.orderDate.getMonth() + "월 " + order.orderDate.getDate() + "일");
        System.out.println("주문자 이름: " + order.ordererName);
        System.out.println("주문 상품 번호: " + order.productNum);
        System.out.println("배송 주소: " + order.shippingAddress);
    }
}
