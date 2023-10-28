package chapter12.collection;

public class Member implements Comparable<Member> {
    // 필드
    private int memberId;
    private String memberName;

    // 생성자
    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    // 회원 중복처리 : hashCode(), equals()
    @Override
    public int hashCode() {
        return memberId;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj;
            if (this.memberId == member.memberId) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    // 회원 ID 기준 정렬 처리
//    @Override
//    public int compareTo(Member member) {
////        return this.memberId - member.memberId; // 오름차순
//        return (this.memberId - member.memberId) * (-1); // 내림차순
//    }

    // 회원 이름순 정렬 처리
    @Override
    public int compareTo(Member member) {
        // String 클래스에 재정의 되어 있는 compareTo() 메서드를 활용
        return this.memberName.compareTo(member.memberName);
    }

    // getter, setter
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

    // toString() 오버라이딩
    @Override
    public String toString() {
        return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
    }


}
