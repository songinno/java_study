package chapter15.others;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    public static void main(String[] args) throws IOException {
        RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
        rf.writeInt(100);
        System.out.println("파일 포인터 위치: " + rf.getFilePointer());

        rf.writeDouble(3.14);
        System.out.println("파일 포인터 위치: " + rf.getFilePointer());

        rf.writeUTF("안녕하세요");
        // 쓰기 끝난 후 파일 포인터 위치
        System.out.println("쓰기 끝난 후, 파일 포인터 위치: " + rf.getFilePointer());

        // 파일 포인터 위치 처음으로 이동
        rf.seek(0);
        System.out.println("파일 포인터 위치: " + rf.getFilePointer());

        int i =  rf.readInt();
        double d = rf.readDouble();
        String str = rf.readUTF();

        // 읽기 끝난 후 파일 포인터 위치
        System.out.println("읽기 끝난 후, 파일 포인터 위치: " + rf.getFilePointer());
        System.out.println(i);
        System.out.println(d);
        System.out.println(str);
    }
}
