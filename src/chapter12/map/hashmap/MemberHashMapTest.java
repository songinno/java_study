package chapter12.map.hashmap;

import chapter12.collection.Member;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();

        Member memberLee = new Member(1001, "이지원");
        Member memberSon = new Member(1002, "손민국");
        Member memberPark = new Member(1003, "박서원");
        Member memberHong = new Member(1004, "홍길동");

        memberHashMap.addMember(memberLee);
        memberHashMap.addMember(memberSon);
        memberHashMap.addMember(memberPark);
        memberHashMap.addMember(memberHong);

        memberHashMap.showAllMember();
        System.out.println("---------------------");

        // 회원 삭제
        memberHashMap.removeMember(1004);
        memberHashMap.showAllMember();
        System.out.println("---------------------");

        // 동일한 ID의 회원 추가
        Member memberLee2 = new Member(1001, "이승철");
        memberHashMap.addMember(memberLee2);
        memberHashMap.showAllMember();


    }
}
