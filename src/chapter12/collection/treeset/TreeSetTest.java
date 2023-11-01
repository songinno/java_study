package chapter12.collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("홍길동");
        treeSet.add("강감찬");
        treeSet.add("이순신");

        System.out.println(treeSet);
        System.out.println("--------");
        for (String s : treeSet) {
            System.out.println(s);
        }
    }
}
