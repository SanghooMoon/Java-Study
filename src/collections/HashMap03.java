package collections;

import java.util.*;

public class HashMap03 {
    static HashMap phoneBook = new HashMap();

    public static void main(String[] args) {
        addPhoneNo("친구", "이자바", "010-111-1111");
        addPhoneNo("친구", "김자바", "010-222-2222");
        addPhoneNo("친구", "김자바", "010-333-3333");
        addPhoneNo("회사", "김대리", "010-444-4444");
        addPhoneNo("회사", "김대리", "010-555-5555");
        addPhoneNo("회사", "박대리", "010-666-6666");
        addPhoneNo("회사", "이과장", "010-777-7777");
        addPhoneNo("세탁", "010-888-8888");

        printList();
    } // main

    // 그룹을 추가하는 메서드
    static void addGroup(String groupName) {
        if(!phoneBook.containsKey(groupName))
            phoneBook.put(groupName, new HashMap());
    }

    // 그룹에 전화번호를 추가하는 메서드
    static void addPhoneNo(String groupName, String name, String tel) {
        addGroup(groupName);    // 그룹이 존재하지않으면 그룹을 추가하는 메서드
        HashMap group = (HashMap)phoneBook.get(groupName);  // key에 매핑된 Value를 리턴
        group.put(tel, name);	// 이름은 중복될 수 있으니 전화번호를 key로 저장한다.
    }
    // 오버로딩
    static void addPhoneNo(String name, String tel) {
        addPhoneNo("기타", name, tel);
    }

    // 전화번호부 전체를 출력하는 메서드
    static void printList() {
        Set set = phoneBook.entrySet();
        Iterator it = set.iterator();

        while(it.hasNext()) {
            Map.Entry e = (Map.Entry)it.next();

            Set subSet = ((HashMap)e.getValue()).entrySet();    // 인원수를 알기위해 모든 value를 Set으로 반환
            Iterator subIt = subSet.iterator();

            System.out.println(" * "+e.getKey()+"["+subSet.size()+"]"); // 그룹명과 해당인원수

            while(subIt.hasNext()) {
                Map.Entry subE = (Map.Entry)subIt.next();
                String telNo = (String)subE.getKey();
                String name = (String)subE.getValue();
                System.out.println(name + " " + telNo );
            }
            System.out.println();
        }
    } // printList()
}
