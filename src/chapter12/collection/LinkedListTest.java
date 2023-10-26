package chapter12.collection;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>();

        // 링크드 리스트에 요소 추가
        myList.add("A");
        myList.add("B");
        myList.add("C");

        // 리스트 전체 출력
        System.out.println(myList);

        // 1 인덱스에 D 추가
        myList.add(1, "D");
        System.out.println(myList);

        // 맨 앞에 O 추가
        myList.addFirst("O");
        System.out.println(myList);

        // 맨 뒤 요소 삭제 후, 삭제된 해당 요소 출력
        String removedString = myList.removeLast();
        System.out.println(removedString);

        System.out.println(myList);
    }
}
