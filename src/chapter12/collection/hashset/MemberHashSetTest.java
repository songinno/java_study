package chapter12.collection.hashset;

import chapter12.collection.Member;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberSet = new MemberHashSet();

        Member memberLee = new Member(1001, "이지원");
        Member memberSon = new Member(1002, "손민국");
        Member memberPark = new Member(1003, "박서원");

        // 회원 추가
        memberSet.addMember(memberLee);
        memberSet.addMember(memberSon);
        memberSet.addMember(memberPark);

        // 전체 회원 출력
        memberSet.showAllMember();

        // 박서원 회원 삭제
        memberSet.removeMember(memberPark.getMemberId());

        // 확인
        memberSet.showAllMember();

        System.out.println("-------------------");
        // 중복 회원 추가
        Member memberHong = new Member(1002, "홍길동");
        memberSet.addMember(memberHong);
        memberSet.showAllMember();
    }
}
