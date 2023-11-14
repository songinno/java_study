package chapter15.serialization;

import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = -6340074075343504866L;
    // 버전 관리를 위한 정보

    String name;
    transient String job; // 직렬화 및 역직렬화 대상에서 제외

    public Person() {

    }

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return name + "," + job;
    }
}
public class SerializationTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Person personAhn = new Person("안재용", "대표이사");
        Person personKim = new Person("김철수", "상무이사");

        try (FileOutputStream fos = new FileOutputStream("serial.out");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            // 직렬화
            oos.writeObject(personAhn);
            oos.writeObject(personKim);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream("serial.out");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            // 역직렬화
            Person p1 = (Person) ois.readObject();
            Person p2 = (Person) ois.readObject();

            System.out.println(p1);
            System.out.println(p2);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
