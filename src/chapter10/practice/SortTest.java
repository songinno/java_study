package chapter10.practice;

import java.io.IOException;

public class SortTest {
    public static void main(String[] args) throws IOException {
        System.out.println("정렬 방식을 선택하세요.");

        System.out.println("B: BubbleSort ");
        System.out.println("Q: QuickSort ");
        System.out.println("H: HeapSort ");

        int ch = System.in.read();
        Sort sort = null;

        if (ch == 'B' || ch == 'b') {
            sort = new BubbleSort();
        } else if (ch == 'Q' || ch == 'q') {
            sort = new QuickSort();

        } else if (ch == 'H' || ch == 'h') {
            sort = new HeapSort();
        } else {
            System.out.println("지원되지 않는 기능입니다.");
            return;
        }

        // 정렬 방식과 상관 없이 Sort에 선언된 메서드 호출
        int[] arr = new int[10];
        sort.ascending(arr);
        sort.descending(arr);
        sort.description();

        String str;

    }
}
