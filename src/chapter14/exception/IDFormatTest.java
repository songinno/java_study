package chapter14.exception;

public class IDFormatTest {
    private String userID;
    private String password;

    public String getUserID() {
        return userID;
    }

    public String getPassword() {
        return password;
    }

    // IDFormatException 예외를 setUserID() 메서드가 호출될 때 처리하도록 미룸
    public void setUserID(String userID) throws IDFormatException {
        if (userID == null) {
            // 강제로 예외 발생시키기
            throw new IDFormatException("아이디는 null일 수 없습니다.");
        } else if (userID.length() < 8 || userID.length() > 20) {
            // 강제로 예외 발생시키기
            throw new IDFormatException("아이디는 8자 이상 20자 이하로 작성해주세요");
        }
        this.userID = userID;
    }

    // PasswordException
    public void setPassword(String password) throws PasswordException {
        if (password == null) {
            throw new PasswordException("비밀번호는 null일 수 없습니다.");
        // 문자열로만 이루어져 있는 경우
        } else if (password.matches("[a-zA-Z가-힣]+")) {
            throw new PasswordException("비밀번호는 문자로만 이루어질 수 없습니다.");
        } else if (password.length() < 5) {
            throw new PasswordException("비밀번호는 5자 이상으로 입력해주세요.");
        }
    }

    public static void main(String[] args) {
        IDFormatTest test = new IDFormatTest();

        String userID = null;

        try {
            test.setUserID(userID);
        } catch (IDFormatException e) {
            System.out.println(e.getMessage());
        }

        userID = "12345";
        try {
            test.setUserID(userID);
        } catch (IDFormatException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("-------------------------");

        // 비밀번호 검증
        String password = null;

        try {
            test.setPassword(password);
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }

        password = "가나다라마바사아자차카타파하";

        try {
            test.setPassword(password);
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }

        password = "abc1";
        try {
            test.setPassword(password);
        } catch (PasswordException e) {
            System.out.println(e.getMessage());
        }

    }
}
