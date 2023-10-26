package chapter12.collection.hashset;

import chapter12.collection.Member;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
    // HashSet 선언
    private HashSet<Member> hashSet;
    // HashSet 생성
    public MemberHashSet() {
        hashSet = new HashSet<Member>();
    }

    // 회원 추가
    public void addMember(Member member) {
        hashSet.add(member);
    }

    // 회원 삭제
    public boolean removeMember(int memberId) {
        Iterator<Member> memberIr = hashSet.iterator();
        while (memberIr.hasNext()) {
            Member member = memberIr.next();
            int tempId = member.getMemberId();

            if (tempId == memberId) {
                hashSet.remove(member);
                return true;
            }
        }

        System.out.println(memberId + " ID를 가진 회원이 존재하지 않습니다.");
        return false;
    }

    // 전체 회원 출력
    public void showAllMember() {
        for (Member member : hashSet) {
            System.out.println(member);
        }
        System.out.println();
    }

}
