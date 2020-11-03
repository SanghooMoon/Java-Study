package collections;

import java.util.*;

/**
 * ListIterator : Iterator를 상속받아 기능을 추가한 클래스, Iterator는 단방향으로만 이동 가능하지만, ListIterator는 양방향 이동가능
 * 다만, ArrayList나 LinkedList와 같이 List인터페이스를 구현한 컬렉션에서만 사용 가능
 */
public class ListIterator01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        ListIterator it = list.listIterator();

        while(it.hasNext()) {
            System.out.print(it.next()); // 순방향으로 진행하면서 읽어온다.
        }
        System.out.println();

        while(it.hasPrevious()) {
            System.out.print(it.previous()); // 역방향으로 진행하면서 읽어온다.
        }
        System.out.println();
    }
}
