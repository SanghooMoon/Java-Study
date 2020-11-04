package collections;

import java.util.*;

public class HashMap02 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("김자바", new Integer(90));
        map.put("김자바", new Integer(100));   // 덮어씌워짐
        map.put("이자바", new Integer(100));
        map.put("강자바", new Integer(80));
        map.put("안자바", new Integer(90));

        Set set = map.entrySet();   //  Iterator로 변환하기위해 Set타입으로 변경, Entry 형태로 Set타입에 저장
        Iterator it = set.iterator();

        while(it.hasNext()) {
            Map.Entry e = (Map.Entry)it.next(); // Object타입으로 반환하기때문에 형 변환
            System.out.println("이름 : "+ e.getKey() + ", 점수 : " + e.getValue());
        }

        set = map.keySet();     // 모든 key를 포함한 Set을 반환
        System.out.println("참가자 명단 : " + set);

        Collection values = map.values();   // 저장된 모든 값을 컬렉션 형태로 반환
        it = values.iterator();

        int total = 0;

        while(it.hasNext()) {
            Integer i = (Integer)it.next();
            total += i.intValue();
        }

        System.out.println("총점 : " + total);
        System.out.println("평균 : " + (float)total/set.size());
        System.out.println("최고점수 : " + Collections.max(values));
        System.out.println("최저점수 : " + Collections.min(values));
    }
}
