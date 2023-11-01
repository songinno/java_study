package chapter12.collection;

import java.util.Comparator;
import java.util.TreeSet;

/* Comparator 인터페이스 구현 예제 */
public class Member2 implements Comparator<Member2> {

    private int memberId;
    private String memberName;

    // TreeSet 생성자에 넣어주기 위해 기본 생성자 정의
    public Member2() {}

    public Member2(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public int compare(Member2 m1, Member2 m2) {
        return m1.memberId - m2.memberId;
    }

    @Override
    public String toString() {
        return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
    }
}
