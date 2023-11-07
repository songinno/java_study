package chapter14.exception;

public class IDFormatException extends Exception {
    // 생성자의 매개 변수로 예외 상황 메시지를 받음
    public IDFormatException(String message) {
        // Exception 클래스에서 메시지 생성자, 멤버 변수, 메서드를 이미 제공
        super(message);
    }
}
