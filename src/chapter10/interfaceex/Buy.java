package chapter10.interfaceex;

public interface Buy {
    void buy();

    // 정적 메서드 중복
    static void pay() {
        System.out.println("Buy의 pay()");
    }

    // 디폴트 메서드 중복
    default void order() {
        System.out.println("구매 주문");
    }
}
