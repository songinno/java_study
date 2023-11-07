package chapter11.string;

public class StringTest3 {
    public static void main(String[] args) {
        // abc
        String str0 = new String("abc");
        String str1 = new String("abc");
        String str2 = "abc";
        String str3 = "abc";

        // abcde
        String str4 = str1 + new String("de");
        String str5 = str1 + "de";
        String str6 = str2 + new String("de");
        String str7 = str2 + "de";
        String str8 = new String("abcde");
        String str9 = "abcde";


        System.out.println(System.identityHashCode(str0));
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));

        System.out.println(System.identityHashCode(str4));
        System.out.println(System.identityHashCode(str5));
        System.out.println(System.identityHashCode(str6));
        System.out.println(System.identityHashCode(str7));
        System.out.println(System.identityHashCode(str8));
        System.out.println(System.identityHashCode(str9));
    }
}
