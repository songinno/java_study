package chapter10.bookshelf;

public class BookShelf extends Shelf implements Queue{
    @Override
    public void enQueue(String title) {
        // 배열에 요소 추가
        shelf.add(title);
    }

    @Override
    public String deQueue() {
        // 맨 처음 요소를 제거하고, 제거한 해당 요소를 반환
        return shelf.remove(0);
    }

    @Override
    public int getSize() {
        // 배열 요소 개수 반환
        return getCount();
    }
}
