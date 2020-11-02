package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 배열, 즉 ArrayList는 연속적으로 메모리상에 존재하기 때문에 원하는 데이터를 보다 빠르게 얻을 수 있다.
 * 반면 LinkedList는 불연속적인 메모리 주소를 가지기 때문에 처음부터 n번쨰까지 차례대로 따라가야한다.
 *
 * 즉, LinkedList는 저장해야하는 데이터 개수가 많아질수록데이터를 읽어오는 시간, 즉 접근시간이 길어진다는 단점이 있다.
 *
 * 컬렉션          읽기(접근시간)    추가/삭제           비고
 * ArrayList :    빠르다           느리다             순차적인 추가삭제는 더 빠름, 비효율적인 메모리 사용
 * LinkedList :   느리다           빠르다             데이터가 많을수록 접근성이 떨어짐
 *
 * 다루고자 하는 데이터의 개수가 변하지 않는 경우라면 ArrayList
 * 데이터 개수의 변경이 잦다면 LinkedList를 사용
 *
 * 조합하는 방법 : 처음에 작업하기 전에 데이터를 저장할 때는 ArrayList를 사용한 후, 작업할 때는 LinkedList로 데이터를 옮겨서 작업하면 좋은 효율을 얻을 수 있다.
 */
public class ArrayLIstLinkedListTest2 {
    public static void main(String args[]) {
        ArrayList al = new ArrayList(1000000);
        LinkedList ll = new LinkedList();
        add(al);
        add(ll);

        System.out.println("= 접근시간 테스트 =");
        System.out.println("ArrayList :"+access(al));
        System.out.println("LinkedList :"+access(ll));
    }
    // 추가하는 메서드
    public static void add(List list) {
        for(int i=0; i<100000;i++) list.add(i+"");
    }
    // 인덱스에 접근시간을 확인하는 메서드
    public static long access(List list) {
        long start = System.currentTimeMillis();

        for(int i=0; i<10000;i++) list.get(i);

        long end = System.currentTimeMillis();

        return end - start;
    }
}
