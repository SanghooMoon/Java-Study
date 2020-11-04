package collections;

import java.util.*;

/**
 * HashSet은 Set인터페이스를 구현한 가장 대표적인 컬렉션, 중복된 요소를 저장하지 않음, 저장순서를 유지하지 않음
 * 중복을 허락하지 않고, 저장순서를 유지하고싶다면 LinkedHashSet을 사용하면 된다.
 */
public class HashSet01 {
    public static void main(String[] args) {

        Object[] objArr = {"1",new Integer(1),"2","2","3","3","4","4","4"};
        Set set = new HashSet();

        for(int i=0; i < objArr.length; i++) {
            set.add(objArr[i]);	// HashSet에 objArr의 요소들을 저장한다.
        }
        // HashSet에 저장된 요소들을 출력한다.
        System.out.println(set);    // 1, 1, 2, 3, 4
                                    // 중복을 저장하지 않는다. 1이 2개인것은 하나는 String 타입, 하나는 Integer 타입이다. 즉 서로 다른 객체
    }
}
