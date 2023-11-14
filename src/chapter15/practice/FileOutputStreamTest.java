package chapter15.practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/* 연습문제 - Q3 */
public class FileOutputStreamTest {
    public static void main(String[] args){
        try (FileOutputStream fos = new FileOutputStream("a.txt");
             OutputStreamWriter osw = new OutputStreamWriter(fos)) {
            osw.write("지금까지 자바 정말 재미있게 공부했어요^^");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
