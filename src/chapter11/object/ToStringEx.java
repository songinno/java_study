package chapter11.object;

class Book {
    int bookNumber;
    String bookTitle;

    Book(int bookNumber, String bookTitle) {
        this.bookNumber = bookNumber;
        this.bookTitle = bookTitle;
    }

    @Override
    public String toString() {
        return bookTitle + "," + bookNumber;
    }
}

public class ToStringEx {
    public static void main(String[] args) {
        Book book = new Book(200, "개미");

        System.out.println(book);
        System.out.println(book.toString());

        String str = new String("test");
        Integer i = new Integer(123);

        System.out.println(str.toString());
        System.out.println(i.toString());
    }
}
