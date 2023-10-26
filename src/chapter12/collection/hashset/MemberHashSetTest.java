package chapter12.collection.hashset;

import chapter12.collection.Member;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberSet = new MemberHashSet();

        Member memberLee = new Member(1001, "이지원");
        Member memberSon = new Member(1002, "손민국");
        Member memberPark = new Member(1003, "박서원");
        Member memberHong = new Member(1004, "홍길동");

        // 회원 추가
        memberSet.addMember(memberLee);
        memberSet.addMember(memberSon);
        memberSet.addMember(memberPark);
        memberSet.addMember(memberHong);

        // 전체 회원 출력
        memberSet.showAllMember();

        // 홍길동 회원 삭제
        memberSet.removeMember(memberHong.getMemberId());

        // 확인
        memberSet.showAllMember();
    }
}
