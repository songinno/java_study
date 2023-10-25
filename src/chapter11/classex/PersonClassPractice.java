package chapter11.classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonClassPractice {
    public static void main(String[] args) throws ClassNotFoundException {
        Class personClass = Class.forName("chapter11.classex.Person");

        System.out.println("----- 생성자 -----");
        Constructor[] cons = personClass.getConstructors();
        for (Constructor c : cons) {
            System.out.println(c);
        }

        System.out.println("----- 필드 -----");
        Field[] fields = personClass.getFields();
        for (Field f : fields) {
            System.out.println(f);
        }
        System.out.println("----- 메서드 -----");
        Method[] methods = personClass.getMethods();
        for (Method m : methods) {
            System.out.println(m);
        }
    }
}
