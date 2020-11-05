package collections;

import java.util.*;


/**
 * Arrays가 Array에 관련된 메서드를 제공하는것 처럼 Collections는 Collection에 관한 메서드를 제공
 *
 * 컬렉션의 동기화(synchronized)
 * 멀티 쓰레드 프로그래밍에서는 하나의 객체를 여러 쓰레드가 동시에 접근할 수 있기 때문에 데이터의 일관성을 유지하기 위해서는 공유되는 객체에 동기화(synchronization)가 필요
 * 필요한 순간에 동시화 메서드를 이용해 동기화가 처리가능하도록 변경
 *
 * 변경불가 컬렉션(unmodifiable)
 * 컬렉션에 저장된 데이터를 보호하기 위해서 컬렉션을 변경할 수 없게, 즉 읽기전용으로 만들어야할때 사용
 *
 * 싱글톤 컬렉션 만들기(singleton)
 * 단 하나의 객체만들 저장하는 컬렉션을 만들고 싶은 경우
 *
 * 한 종류의 객체만 저장하는 컬렉션 만들기(checked) -> 제네릭스로 처리도 가능
 * 컬렉션에 지정된 종류의 객체만 저장할 수 있도록 제한하고 싶을 때 사용
 *
 */
public class Collections01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list);       // []

        Collections.addAll(list, 1,2,3,4,5);
        System.out.println(list);       // [1,2,3,4,5]

        Collections.rotate(list, 2);    // 오른쪽으로 두칸 이동
        System.out.println(list);               // [4,5,1,2,3]

        Collections.swap(list, 0, 2);       // 첫번째와 세번째를 교환
        System.out.println(list);               // [1,5,4,2,3]

        Collections.shuffle(list);  // 저장된 요소의 위치를임의로 변경
        System.out.println(list);

        // 내림차순
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int a = Integer.parseInt(o1.toString());
                int b = Integer.parseInt(o2.toString());
                return b-a;
            }
        });
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);   // 정렬 오름차순

        Collections.sort(list, Collections.reverseOrder()); // Collentions.reverse(list) 와 동일
        System.out.println(list);

        int idx = Collections.binarySearch(list, 3);    // 3이 있는 index 반환
        System.out.println(idx);

        System.out.println(Collections.max(list));  // 최대값
        System.out.println(Collections.min(list));  // 최소값

        Collections.fill(list, 9);  // list를 9로 채운다
        System.out.println("list = " + list);

        // list와 같은 크기의 새로운 list를 생성하고 2로 채운다. 단, 결과는 변경 불가
        List newList = Collections.nCopies(list.size(), 2);
        System.out.println("newList = " + newList);

        System.out.println(Collections.disjoint(list, newList));    // 공통요소가 하나라도 없으면 true

        Collections.copy(list, newList);    // list를 newList로 복사
        System.out.println("list = " + list);
        System.out.println("newList = " + newList);

        Collections.replaceAll(list, 2, 1); // list의 2를 1로 모두 바꿈
        System.out.println("list = " + list);

        Enumeration e = Collections.enumeration(list);
        ArrayList list2 = Collections.list(e);
        System.out.println(list2);


    }
}
