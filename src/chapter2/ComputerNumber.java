package chapter2;

/*
* 2진수, 8진수, 16진수
* */
public class ComputerNumber {
    public static void main(String[] args) {
        int decimal = 10; // 10진수
        int binary = 0B1010; // 2진수
        int octal = 012; // 8진수
        int hexadecimal = 0XA; // 16진수

        if (decimal == binary) {
            System.out.println("decimal == binary");
        }

        if (decimal == octal) {
            System.out.println("decimal == octal");
        }

        if (decimal == hexadecimal) {
            System.out.println("decimal == hexadecimal");
        }
    }
}
