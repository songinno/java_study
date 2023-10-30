package chapter12.map.treemap;

import chapter12.collection.Member;

public class MemberTreeMapTest {
    public static void main(String[] args) {
        MemberTreeMap memberTreeMap = new MemberTreeMap();

        Member memberSon = new Member(1002, "손민국");
        Member memberLee = new Member(1001, "이지원");
        Member memberHong = new Member(1004, "홍길동");
        Member memberPark = new Member(1003, "박서원");

        memberTreeMap.addMember(memberLee);
        memberTreeMap.addMember(memberSon);
        memberTreeMap.addMember(memberPark);
        memberTreeMap.addMember(memberHong);

        memberTreeMap.showAllMember();
        System.out.println("---------------------");

        // 회원 삭제
        memberTreeMap.removeMember(1004);
        memberTreeMap.showAllMember();
        System.out.println("---------------------");

        // 동일한 ID의 회원 추가
        Member memberLee2 = new Member(1001, "이승철");
        memberTreeMap.addMember(memberLee2);
        memberTreeMap.showAllMember();


    }
}
