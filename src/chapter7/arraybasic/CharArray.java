package chapter7.arraybasic;

public class CharArray {
    public static void main(String[] args) {
        char[] alphabets = new char[26];
        char ch = 'A';

        for (int i = 0; i < alphabets.length; i++, ch++) {
            alphabets[i] = ch;
            System.out.println("알파벳: " + ch + ", ASCII: " + (int)ch);
        }
    }
}
