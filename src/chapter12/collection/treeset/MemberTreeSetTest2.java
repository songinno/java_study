package chapter12.collection.treeset;

import chapter12.collection.Member2;

public class MemberTreeSetTest2 {
    public static void main(String[] args) {

        MemberTreeSet2 memberTreeSet = new MemberTreeSet2();


        Member2 memberPark = new Member2(1003, "박서훤");
        Member2 memberLee = new Member2(1001, "이지원");
        Member2 memberSon = new Member2(1002, "손민국");


        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberSon);
        memberTreeSet.addMember(memberPark);
        memberTreeSet.showAllMember();

        Member2 memberHong = new Member2(1003, "홍길동");  //1003 아이디 중복
        memberTreeSet.addMember(memberHong);
        memberTreeSet.showAllMember();

        Member2 memberHong2 = new Member2(1004, "홍길동"); // 이름 중복
        memberTreeSet.addMember(memberHong2);
        memberTreeSet.showAllMember();
    }
}
