package chapter11.classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
* reflection 프로그래밍 예제
* */
public class StringClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class strClass = Class.forName("java.lang.String");

        // 모든 생성자 가져오기
        Constructor[] cons = strClass.getConstructors();
        for (Constructor c : cons) {
            System.out.println(c);
        }

        System.out.println("-----------------------");
        // 모든 멤버 변수(필드) 가져오기
        Field[] fields = strClass.getFields();
        for (Field f : fields) {
            System.out.println(f);
        }

        System.out.println("-----------------------");
        // 모든 메서드 가져오기
        Method[] methods = strClass.getMethods();
        for (Method m : methods) {
            System.out.println(m);
        }
    }
}
