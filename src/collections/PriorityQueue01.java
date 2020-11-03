package collections;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * PriorityQueue : Queue인터페이스 구현체 중 하나로, 저장한 순서에 관계없이 우선순위가 높은 것부터 꺼냄, null을 저장할 수 없음
 * 정수를 사용해도 Integer 형으로 오토박싱을 해주고, 우선순위는 1이 가장 높음
 */
public class PriorityQueue01 {
    public static void main(String[] args) {
        Queue pq = new PriorityQueue();
        pq.offer(3);  // pq.offer(new Integer(3)); 오토박싱
        pq.offer(1);
        pq.offer(5);
        pq.offer(2);
        pq.offer(4);

        System.out.println(pq); // pq의 내부 배열을 출력

        Object obj = null;

        // PriorityQueue에 저장된 요소를 하나씩 꺼낸다.
        while((obj = pq.poll())!=null)
            System.out.println(obj);    // 3 1 5 2 4 순서대로 넣었지만, 1 2 3 4 5 순서로 출력
    }
}
