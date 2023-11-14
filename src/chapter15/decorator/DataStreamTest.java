package chapter15.decorator;

import java.io.*;

public class DataStreamTest {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("data.txt");
             DataOutputStream dos = new DataOutputStream(fos)) {
            // 각 자료형에 맞게 자료 쓰기
            dos.writeByte(100);
            dos.writeChar('A');
            dos.writeInt(10);
            dos.writeFloat(3.14f);
            dos.writeUTF("Test");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 자료형에 맞게 자료를 읽어 출력
        // 파일에 쓴 순서와 같은 순서, 같은 메서드로 읽어야 함
        try (FileInputStream fis = new FileInputStream("data.txt");
             DataInputStream dis = new DataInputStream(fis)) {
            System.out.println(dis.readByte());
            System.out.println(dis.readChar());
            System.out.println(dis.readInt());
            System.out.println(dis.readFloat());
            System.out.println(dis.readUTF());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
