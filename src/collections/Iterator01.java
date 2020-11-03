package collections;

import java.util.*;

/**
 * Iterator : 컬렉션에 저장된 요소들을 읽어오는 방법을 표준화
 *
 * boolean hasNext() : 읽어올 요소가 남아있는지 확인, 있으면 true 없으면 false
 * Object next() : 다음 요소를 읽어온다.
 * void remove() : next()로 읽어 온 요소를 삭제한다. next()로 호출 한 다음에 remove()를 호출해야한다(선택적 기능)
 *
 * List클래스들은 저장순서를 유지하기 때문에 Iterator를 이용해서 읽어 온 결과 역시 순서를 유지하지만
 * Set클래스들은 요소간의 순서가 유지되지 않기떄문에 Iterator를 이용해도 처음에 저장된 순서랑 다름
 */
public class Iterator01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Iterator it = list.iterator();
        while(it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
    } // main
}
