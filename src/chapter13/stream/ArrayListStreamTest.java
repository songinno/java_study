package chapter13.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayListStreamTest {
    public static void main(String[] args) {
        ArrayList<String> sList = new ArrayList<>();
        sList.add("Tomas");
        sList.add("Edward");
        sList.add("Jack");

        Stream<String> stream = sList.stream();
        stream.forEach(s -> System.out.println(s + " "));
        System.out.println();

        sList.stream().sorted().forEach(s -> System.out.println(s));

    }
}
