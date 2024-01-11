package chapter13.innerclass;

public class LocalInnerTest2 {
    // 외부 클래스의 메서드
    public void exec(int i) {
        int outVal = 100; // 외부 클래스의 메서드 내, 지역 변수
        // 지역 내부 클래스
        class Cal {
            int inVal = 0; // 지역 내부 클래스 내부 변수

            public void plus() {
//                outVal += 100;
//                i += 200;
                inVal += 300;
            }
        }

        // 메서드 내부에서만 Cal 객체 생성 및 메서드 호출 가능
        Cal cal = new Cal();
        cal.plus();
        System.out.println(outVal);
        System.out.println(i);
        System.out.println(cal.inVal);
    }

    public static void main(String[] args) {
        LocalInnerTest2 test = new LocalInnerTest2();
        test.exec(200);
    }
}
