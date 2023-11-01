package chapter12.collection.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

    // String 내림차순 정렬로 재정의
    @Override
    public int compare(String s1, String s2) {
        return (s1.compareTo(s2) * (-1));
    }
}
public class ComparatorTest {
    public static void main(String[] args) {
        Set<String> stringSet = new TreeSet<>(new MyCompare());

        stringSet.add("aaa");
        stringSet.add("ccc");
        stringSet.add("bbb");

        System.out.println(stringSet);
    }
}
