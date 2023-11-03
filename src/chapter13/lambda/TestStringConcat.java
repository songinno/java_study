package chapter13.lambda;

public class TestStringConcat {
    public static void main(String[] args) {
        StringConcatImpl sc = new StringConcatImpl();
        sc.makeString("Hello", "World");

        StringConcat sc2 = (str1, str2) -> System.out.println(str1 + "," + str2);
        sc2.makeString("Hello", "World");

        StringConcat sc3 = new StringConcat() {
            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s1 + "," + s2);
            }
        };

        int i = 10;
        StringConcat sc4 = (str1, str2) -> {
//            i = 100; // 지역 변수 상수화로 외부 클래스의 지역 변수 값 변경 시 오류 발생
            int i2 = 100;
            i2 = 200;
            str1 += ",hihihi";
            System.out.println(str1 + "," + str2);
            System.out.println(i); // 변수 값을 바꾸지 않고, 그냥 출력하는 것은 오류 발생X
            System.out.println(i2);
        };

        sc4.makeString("Hello", "String");
    }
}
