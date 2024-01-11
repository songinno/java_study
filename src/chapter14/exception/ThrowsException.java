package chapter14.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
        // FileNotFoundException 발생 가능
        FileInputStream fis = new FileInputStream(fileName);
        // ClassNotFoundException 발생 가능
        Class c = Class.forName(className);

        return c;
    }

    public static void main(String[] args) {
        ThrowsException test = new ThrowsException();
        // 메서드를 호출할 때 예외 처리
        try {
            test.loadClass("a.txt", "java.lang.String");
        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        }


        try {
            test.loadClass("a.txt", "java.lang.String");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) { // Exception 클래스로 그 외의 예외 상황 처리
            e.printStackTrace();
        }
    }
}
