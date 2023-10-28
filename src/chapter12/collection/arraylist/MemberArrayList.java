package chapter12.collection.arraylist;

import chapter12.collection.Member;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
    /* 필드 */
    private ArrayList<Member> arrayList;

    /* 생성자 */
    public MemberArrayList() {
        arrayList = new ArrayList<Member>();
    }

    /* 메서드 */
    // 회원 추가
    public void addMember(Member member) {
        arrayList.add(member);
    }

    // 회원 삭제
//    public boolean removeMember(int memberId) {
//        for (int i = 0; i < arrayList.size(); i++) {
//            Member member = arrayList.get(i);
//            int tempId = member.getMemberId();
//
//            if (tempId == memberId) {
//                arrayList.remove(i);
//                return true;
//            }
//        }
//        System.out.println(memberId + "가 존재하지 않습니다.");
//        return false;
//    }

    // 회원 삭제 - Iterator 사용
    public boolean removeMember(int memberId) {
        Iterator<Member> memberIr = arrayList.iterator();
        while (memberIr.hasNext()) {
            Member member = memberIr.next();
            int tempId = member.getMemberId();
            if (memberId == tempId) {
                arrayList.remove(member);
                return true;
            }
        }
        System.out.println(memberId + " ID를 가진 회원이 존재하지 않습니다.");
        return false;
    }

    // 전체 회원 출력
    public void showAllMember() {
        for (Member member : arrayList) {
            System.out.println(member);
        }
        System.out.println();
    }

    // n번째 자리에 회원 추가
    public void addMemberSpecificSpot(int index, Member member) {
        arrayList.add(index - 1, member);
    }
}
