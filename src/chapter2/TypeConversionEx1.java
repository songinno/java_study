package chapter2;
/* 묵시적 형 변환 */
public class TypeConversionEx1 {
    public static void main(String[] args) {
        byte bNum = 10;
        int iNum = bNum;

        System.out.println(bNum);
        System.out.println(iNum);

        Long lNum = 20L;
        float fNum = lNum;

        System.out.println(lNum);
        System.out.println(fNum);

        double dNum;
        dNum = iNum + fNum;
        System.out.println(dNum);
    }
}
