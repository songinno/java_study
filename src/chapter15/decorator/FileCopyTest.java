package chapter15.decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {
    public static void main(String[] args) {
        long millisecond = 0;
        try (FileInputStream fis = new FileInputStream("a.zip")) {
            FileOutputStream fos = new FileOutputStream("copy.zip");
            millisecond = System.currentTimeMillis(); // 파일 복사를 시작하기 전 시간
            int i;
            while ((i = fis.read()) != -1) {
                fos.write(i);
            }
            millisecond = System.currentTimeMillis() - millisecond; // 파일을 복사하는 데 걸린 시간
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("파일을 복사하는 데 " + millisecond + " millisecond 소요되었습니다.");
    }
}
