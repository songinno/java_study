package chapter7.arraybasic;

public class ObjectArrayCopy2 {
    public static void main(String[] args) {
        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];

        bookArray1[0] = new Book("태백산맥", "조정래");
        bookArray1[1] = new Book("데미안", "헤르만 헤세");
        bookArray1[2] = new Book("어떻게 살 것인가", "유시민");

        // 깊은 복사
        for (int i = 0; i < bookArray2.length; i++) {
            bookArray2[i] = new Book();
            bookArray2[i].setBookName(bookArray1[i].getBookName());
            bookArray2[i].setAuthor(bookArray1[i].getAuthor());
        }

        // 배열 복사 후, bookArray1의 요소 값 변경
        bookArray1[0].setBookName("나목");
        bookArray1[0].setAuthor("박완서");

        System.out.println("--------- 배열 요소 값 ---------");
        for (int i = 0; i < bookArray1.length; i++) {
            bookArray1[i].showBookInfo();
        }

        for (int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].showBookInfo();
        }

        System.out.println("--------- 주소값 ---------");
        for (int i = 0; i < bookArray1.length; i++) {
            System.out.println(bookArray1[i]);
        }

        for (int i = 0; i < bookArray2.length; i++) {
            System.out.println(bookArray2[i]);
        }

    }
}
