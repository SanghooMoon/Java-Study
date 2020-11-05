package collections;

import java.util.*;

/**
 * TreeMap : 이진검색트리의 형태로 키와 값의 쌍으로 이루어진 데이터를 저장.
 * 검색과 정렬에 적합한 컬렉션 클래스
 *
 * 검색에 관한 대부분의 경우에서 HashMap이 TreeMap보다 뛰어남
 * 범위검색이나 정렬이 필요한 경우에는 TreeMap
 */
public class TreeMap01 {
    public static void main(String[] args) {
        String[] data = { "A","K","A","K","D","K","A","K","K","K","Z","D" };

        TreeMap map = new TreeMap();

        for(int i=0; i < data.length; i++) {
            if(map.containsKey(data[i])) {     // 이미 포함된 key 라면 +1
                Integer value = (Integer)map.get(data[i]);
                map.put(data[i], new Integer(value.intValue() + 1));
            } else {    // 그렇지 않다면 1로 초기화
                map.put(data[i], new Integer(1));
            }
        }

        Iterator it = map.entrySet().iterator();

        System.out.println("= 기본정렬 =");
        while(it.hasNext()) {   // TreeMap은 key가 기본정렬된 상태로 저장
            Map.Entry entry = (Map.Entry)it.next();
            int value = ((Integer)entry.getValue()).intValue();
            System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value );
        }
        System.out.println();

        // map을 ArrayList로 변환한 다음에 Collectons.sort()로 정렬
        Set set = map.entrySet();
        List list = new ArrayList(set);	// ArrayList(Collection c)

        // static void sort(List list, Comparator c)
        Collections.sort(list, new ValueComparator());  // 새로운 기준으로 정렬

        it = list.iterator();

        System.out.println("= 값의 크기가 큰 순서로 정렬 =");
        while(it.hasNext()) {
            Map.Entry entry = (Map.Entry)it.next();
            int value = ((Integer)entry.getValue()).intValue();
            System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value );
        }

    } // 	public static void main(String[] args)

    // 기준을 정하기위한 클래스 및 메서드
    static class ValueComparator implements Comparator {
        public int compare(Object o1, Object o2) {
            if(o1 instanceof Map.Entry && o2 instanceof Map.Entry) {
                Map.Entry e1 = (Map.Entry)o1;
                Map.Entry e2 = (Map.Entry)o2;

                int v1 = ((Integer)e1.getValue()).intValue();
                int v2 = ((Integer)e2.getValue()).intValue();

                return  v2 - v1 ;    // value 내림차순
            }
            return -1;
        }
    }	// 	static class ValueComparator implements Comparator {

    public static String printBar(char ch, int value) {
        char[] bar = new char[value];

        for(int i=0; i < bar.length; i++) {
            bar[i] = ch;
        }

        return new String(bar);
    }
}
