package chapter12.collection.treeset;

import chapter12.collection.Member;
import chapter12.collection.hashset.MemberHashSet;

public class MemberTreeSetTest {
    public static void main(String[] args) {

        MemberTreeSet memberTreeSet = new MemberTreeSet();


        Member memberPark = new Member(1003, "박서훤");
        Member memberLee = new Member(1001, "이지원");
        Member memberSon = new Member(1002, "손민국");


        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberSon);
        memberTreeSet.addMember(memberPark);
        memberTreeSet.showAllMember();

        Member memberHong = new Member(1003, "홍길동");  //1003 아이디 중복
        memberTreeSet.addMember(memberHong);
        memberTreeSet.showAllMember();

        Member memberHong2 = new Member(1004, "홍길동"); // 이름 중복
        memberTreeSet.addMember(memberHong2);
        memberTreeSet.showAllMember();
    }
}
