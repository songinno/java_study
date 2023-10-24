package chapter10.interfaceex;

public interface Sell {
    void sell();

    // 정적 메서드 중복
    static void pay() {
        System.out.println("Sell의 pay()");
    }

    // 디폴트 메서드 중복
    default void order() {
        System.out.println("판매 주문");
    }
}
