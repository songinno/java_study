package chapter2;

public class CharacterEx3 {
    public static void main(String[] args) {
        int a = 65;
        int b = -66;

        char a2 = 65;
//        char b2 = -66; // char형 변수에 음수 값을 대입하려 하면, 오류 발생 -> 주석처리

        System.out.println((char)a);
        System.out.println((char)b);
        System.out.println(a2);
    }
}
