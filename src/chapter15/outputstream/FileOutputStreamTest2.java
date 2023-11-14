package chapter15.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {
    public static void main(String[] args) throws FileNotFoundException {
        // 향상된 try-with-resources문 (자바 9~)
        FileOutputStream fos = new FileOutputStream("output2.txt", true);
        try (fos) {
            byte[] bs = new byte[26];
            byte data = 65; // A의 아스키 값
            // A ~ Z까지 배열에 넣기
            for (int i = 0; i < bs.length; i++) {
                bs[i] = data;
                data++;
            }
            fos.write(bs);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("출력이 완료되었습니다.");

    }
}
