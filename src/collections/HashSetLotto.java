package collections;

import java.util.*;

public class HashSetLotto {
    public static void main(String[] args) {
        Set set = new HashSet();    // HashSet 생성

        for (int i = 0; set.size() < 6 ; i++) {
            int num = (int)(Math.random()*45) + 1;  // 난수 생성
            set.add(new Integer(num));              // 생성된 set에 추가
        }

        List list = new LinkedList(set);	// LinkedList(Collection c)
        Collections.sort(list);				// Collections.sort(List list)
        System.out.println(list);
    }
}
