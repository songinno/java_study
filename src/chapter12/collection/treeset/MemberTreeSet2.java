package chapter12.collection.treeset;

import chapter12.collection.Member2;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet2 {

    private TreeSet<Member2> treeSet;

    // TreeSet 생성자에 Comparator를 구현한 객체를 매개변수로 전달
    public MemberTreeSet2(){
        treeSet = new TreeSet<Member2>(new Member2());
    }

    public void addMember(Member2 member){
        treeSet.add(member);
    }

    public boolean removeMember(int memberId){

        Iterator<Member2> ir = treeSet.iterator();

        while( ir.hasNext()){
            Member2 member = ir.next();
            int tempId = member.getMemberId();
            if( tempId == memberId){
                treeSet.remove(member);
                return true;
            }
        }

        System.out.println(memberId + "가 존재하지 않습니다");
        return false;
    }

    public void showAllMember(){
        for(Member2 member : treeSet){
            System.out.println(member);
        }
        System.out.println();
    }
}
