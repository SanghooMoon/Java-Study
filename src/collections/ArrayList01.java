package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList01 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        ArrayList list2 = new ArrayList(list1.subList(1,4));    // 인덱스 1부터 4미만까지 복사
        print(list1, list2);

        Collections.sort(list1);	// list1과 list2를 오름차순 정렬한다.
        Collections.sort(list2);	// Collections.sort(List l)
        print(list1, list2);

        System.out.println("list1.containsAll(list2):" + list1.containsAll(list2)); // list1이 list2의 모든 요소를 포함하고 있으sl true

        list2.add("B");
        list2.add("C");
        list2.add(3, "A");
        print(list1, list2);

        list2.set(3, "AA");     // set() : 3번째 인덱스를 "AA"로 변경
        print(list1, list2);

        // list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
        System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));
        print(list1, list2);

        //  list2에서 list1에 포함된 객체들을 삭제한다. 거꾸로 반복문을 도는 이유는 앞에서 부터 돌면 인덱스가 당겨져서 올바른 결과를 얻을 수 없음.
        for(int i= list2.size()-1; i >= 0; i--) {
            if(list1.contains(list2.get(i)))
                list2.remove(i);
        }
        print(list1, list2);
    }

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1:"+list1);
        System.out.println("list2:"+list2);
        System.out.println();
    }
}
