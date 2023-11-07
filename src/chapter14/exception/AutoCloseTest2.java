package chapter14.exception;

public class AutoCloseTest2 {
    public static void main(String[] args) {
        AutoCloseObj obj1 = new AutoCloseObj();
        AutoCloseObj obj2 = new AutoCloseObj();

        try (obj1; obj2) {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("예외 부분입니다.");
        }
    }
}
