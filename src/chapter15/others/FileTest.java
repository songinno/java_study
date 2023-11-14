package chapter15.others;


import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
        // 파일 생성 경로 및 파일명 지정
        File file = new File("D:\\study\\java2\\java_sutdy2\\src\\chapter15\\newFile.txt");
        file.createNewFile(); // 실제 파일 생성

        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());

        file.delete(); // 파일 삭제
    }
}
