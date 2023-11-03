package chapter13.practice;

import java.util.ArrayList;
import java.util.List;

class Book {
    private String name;
    private int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}

public class LibraryTest {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("자바", 25000));
        bookList.add(new Book("파이썬", 15000));
        bookList.add(new Book("안드로이드", 30000));

        // 스트림 생성 및 출력
        System.out.println("===== 1. 모든 책의 가격의 합 =====");
        int totalPrice = bookList.stream().mapToInt(book -> book.getPrice()).sum();
        System.out.println(totalPrice);

        System.out.println("===== 2. 책의 가격이 20,000원 이상인 책의 이름을 정렬하여 출력 =====");
        bookList.stream().filter(book -> book.getPrice() > 20000).map(book -> book.getName()).sorted().forEach(s -> System.out.println(s));
    }
}
