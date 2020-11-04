package collections;

import java.util.*;

/**
 * TreeSet은 이진 검색 트리라는 자료구조의 형태로 데이터를 저장하는 컬렉션 클래스
 * Set 인터페이스를 구현했으므로, 중복을 허용하지않고, 정렬된 위치에 저장되므로 순서를 유지하지 않는다.
 *
 * 이진검색트리
 * 1. 모든 노드는 최대 두 개의 자식노드를 가질 수 있다.
 * 2. 왼쪽 자식노드의ㅡ 값은 부모노드의 값보다 작고 오른쪽자식노드의 값은 부모노드의 값보다 커야한다.
 * 3. 노드의 추가 삭제에 시간이 걸린다.(순차적으로 저장하지 않으므로)
 * 4. 검색(범위검색), 정렬에 유리하다.
 * 5. 중복된 값을 저장하지 못한다.
 */
public class TreeSetLotto {
    public static void main(String[] args) {
        Set set = new TreeSet();

        for (int i = 0; set.size() < 6 ; i++) {
            int num = (int)(Math.random()*45) + 1;
            set.add(num);  // set.add(new Integer(num));
        }

        System.out.println(set);    // TreeSet은 저장할 떄 이미 정렬하기 때문에 따로 정렬할 필요가 없음.
    }
}
