package chapter7.arraylist;

import chapter7.arraybasic.Book;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        // ArrayList 선언
        ArrayList<Book> library = new ArrayList<Book>();

        // add() 메서드를 통한 요소 값 추가
        library.add(new Book("태백산맥", "조정래"));
        library.add(new Book("데미안", "헤르만 허세"));
        library.add(new Book("어떻게 살 것인가", "유시민"));
        library.add(new Book("토지", "박경리"));
        library.add(new Book("어린왕자", "생텍쥐페리"));

        for (int i = 0; i < library.size(); i++) {
            Book book = library.get(i);
            book.showBookInfo();
        }
        System.out.println();

        System.out.println("===== 향상된 for문 사용 =====");
        for (Book book : library) {
            book.showBookInfo();
        }
    }
}
