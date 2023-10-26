package chapter12.collection.arraylist;

import java.util.ArrayList;

class MyQueue {
    private ArrayList<String> myQueue = new ArrayList<>();

    public void enQueue(String data) {
        myQueue.add(data);
    }

    public String deQueue() {
        int len = myQueue.size();
        if (len == 0) {
            System.out.println("Queue가 비어있습니다.");
            return null;
        }
        return myQueue.remove(0);
    }
}
public class QueueTest {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.enQueue("A");
        myQueue.enQueue("B");
        myQueue.enQueue("C");

        System.out.println("제거된 요소 : " + myQueue.deQueue());
        System.out.println("제거된 요소 : " + myQueue.deQueue());
        System.out.println("제거된 요소 : " + myQueue.deQueue());
        System.out.println("제거된 요소 : " + myQueue.deQueue());
    }
}
