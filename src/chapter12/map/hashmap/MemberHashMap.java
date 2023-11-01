package chapter12.map.hashmap;

import chapter12.collection.Member;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {
    private HashMap<Integer, Member> hashMap;

    public MemberHashMap() {
        hashMap = new HashMap<Integer, Member>();
    }

    public void addMember(Member member) {
        // key-value 쌍으로 요소를 추가
        hashMap.put(member.getMemberId(), member);
    }

    public boolean removeMember(int memberId) {
        if (hashMap.containsKey(memberId)) { // key 값이 HashMap에 존재하는지 확인
            hashMap.remove(memberId); // key값으로 HashMap의 요소 제거
            return true;
        }

        System.out.println(memberId + " ID를 가진 회원이 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {
        Iterator<Integer> ir = hashMap.keySet().iterator(); // 모든 key값들을 Set으로 반환 + 순회할 수 있는 Iterator를 반환
        while (ir.hasNext()) {
            int key = ir.next();
            Member member = hashMap.get(key); // key값에 해당하는 value 값 가져오기
            System.out.println(member);
        }
        System.out.println();
    }
}
