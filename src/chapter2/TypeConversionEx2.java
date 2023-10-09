package chapter2;
/* 명시적 형 변환 */
public class TypeConversionEx2 {
    public static void main(String[] args) {
        // 바이트 크기가 큰 자료형 → 작은 자료형으로 대입
        int iNum = 10;
        byte bNum = (byte) iNum;

        int iNum2 = 1000;
        byte bNum2 = (byte) iNum2; // 자료 손실 발생

        System.out.println(iNum2);
        System.out.println(bNum2);

        // 더 정밀한 자료형 → 덜 정밀한 자료형으로 대입
        double dNum = 3.14;
        int iNum3 = (int)dNum;

        System.out.println(dNum);
        System.out.println(iNum3);

        // 연산 중 형 변환
        double dNum2 = 1.2;
        float fNum = 0.9F;

        int iNum4 = (int)dNum2 + (int)fNum;
        int iNum5 = (int)(dNum2 + fNum);

        System.out.println(iNum4);
        System.out.println(iNum5);
    }
}
