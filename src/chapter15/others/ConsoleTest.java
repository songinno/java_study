package chapter15.others;

import java.io.Console;

public class ConsoleTest {
    public static void main(String[] args) {
        Console console = System.console();

        System.out.println("이름: ");
        String name = console.readLine();

        System.out.println("직업: ");
        String job = console.readLine();

        System.out.println("비밀번호: ");
        char[] password = console.readPassword();
        String strPass = new String(password);

        System.out.println("name = " + name);
        System.out.println("job = " + job);
        System.out.println("password = " + password);
        System.out.println("strPass = " + strPass);
    }
}
