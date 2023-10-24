package chapter11.object;

class Student {
    int studentID;
    String studentName;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public String toString() {
        return studentID + "," + studentName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student std = (Student) obj;
            if (this.studentID == std.studentID) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return studentID;
    }
}

public class EqualsTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100, "이상원");
        Student studentLee2 = studentLee;
        Student studentSang = new Student(100, "이상원");

        // studentLee와 studentLee2 비교
        if (studentLee == studentLee2) { // ==로 비교
            System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
        } else {
            System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
        }

        if (studentLee.equals(studentLee2)) { // equals()로 비교
            System.out.println("studentLee와 studentLee2는 동일합니다.");
        } else {
            System.out.println("studentLee와 studentLee2는 다릅니다.");
        }

        // studentLee와 studentSang 비교
        if (studentLee == studentSang) { // ==로 비교
            System.out.println("studentLee와 studentSang의 주소는 같습니다.");
        } else {
            System.out.println("studentLee와 studentSang의 주소는 다릅니다.");
        }

        if (studentLee.equals(studentSang)) { // equals()로 비교
            System.out.println("studentLee와 studentSang는 동일합니다.");
        } else {
            System.out.println("studentLee와 studentSang는 다릅니다.");
        }

        System.out.println(studentLee.hashCode());
        System.out.println(studentLee2.hashCode());
        System.out.println(studentSang.hashCode());

        System.out.println(System.identityHashCode(studentLee));
        System.out.println(System.identityHashCode(studentLee2));
        System.out.println(System.identityHashCode(studentSang));

    }
}
