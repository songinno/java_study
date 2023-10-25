package chapter11.string;

public class StringTest2 {
    public static void main(String[] args) {
        String javaStr = new String("java");
        String androidStr = new String("android");
        System.out.println(javaStr);
        System.out.println("처음 javaStr 문자열의 주소 값: " + System.identityHashCode(javaStr));

        javaStr = javaStr.concat(androidStr); // 두 문자열을 연결하여 javaStr에 대입

        System.out.println(javaStr);
        System.out.println("연결된 문자열의 주소 값: " + System.identityHashCode(javaStr));
    }
}
