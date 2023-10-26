package chapter12.collection.arraylist;

import chapter12.collection.Member;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();

        Member memberLee = new Member(1001, "이지원");
        Member memberSon = new Member(1002, "손민국");
        Member memberPark = new Member(1003, "박서원");
        Member memberHong = new Member(1004, "홍길동");

        // 회원 추가
        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberSon);
        memberArrayList.addMember(memberPark);
        memberArrayList.addMember(memberHong);

        // 전체 회원 출력
        memberArrayList.showAllMember();

        // 홍길동 회원 삭제
        memberArrayList.removeMember(memberHong.getMemberId());

        // 확인
        memberArrayList.showAllMember();

        // memberArrayList의 2번째에 회원 추가하기
        Member memberKim = new Member(1005, "김부각");
        memberArrayList.addMemberSpecificSpot(2, memberKim);
        memberArrayList.showAllMember();
    }
}
