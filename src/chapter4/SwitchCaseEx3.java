package chapter4;

public class SwitchCaseEx3 {
    public static void main(String[] args) {
        String medal = "Gold";

        switch (medal) {
            case "Gold":
                System.out.println("금메달입니다.");
                break;
            case "Silver":
                System.out.println("은메달입니다.");
                break;
            default:
                System.out.println("동메달입니다.");
        }
    }
}
