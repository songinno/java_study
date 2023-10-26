package chapter12.genericmethod;

public class Point<T, V> {
    T x;
    V y;

    public Point(T x, V y) {
        this.x = x;
        this.y = y;
    }

    // 제네릭 메서드
    public T getX() {
        return x;
    }

    public V getY() {
        return y;
    }
}
