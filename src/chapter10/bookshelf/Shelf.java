package chapter10.bookshelf;

import java.util.ArrayList;

public class Shelf {
    // 자료를 순서대로 저장할 ArrayList
    protected ArrayList<String> shelf;

    // 디폴트 생성자
    public Shelf() {
        shelf = new ArrayList<String>();
    }

    public ArrayList<String> getShelf() {
        return shelf;
    }

    public int getCount() {
        return shelf.size();
    }
}
