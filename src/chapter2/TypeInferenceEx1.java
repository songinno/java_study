package chapter2;

public class TypeInferenceEx1 {
    public static void main(String[] args) {
        var num = 10;
        var dNum = 10.0;
        var str = "hello";

        Object obj = null;

        obj = num;
        System.out.println(obj.getClass().getName());

        obj = dNum;
        System.out.println(obj.getClass().getName());

        obj = str;
        System.out.println(obj.getClass().getName());
    }
}
