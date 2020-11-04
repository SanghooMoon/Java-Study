package collections;

import java.util.TreeSet;

/**
 * headSet(), tailSet()는 TreeSet에 저장된 객체 중 지정된 기준 값보다 큰값의 객체들과 작은 값의 객체들을 얻을 수 있다.
 * headSet() : 지정된 객체보다 작은 값의 객체들을 반환
 * tailSet() : 지정된 객체보다 큰 값의 객체들을 반환
 */
public class TreeSet02 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        int[] score = {80, 95, 50, 35, 45, 65, 10, 100};

        for(int i=0; i < score.length; i++)
            set.add(new Integer(score[i]));

        System.out.println("50보다 작은 값 :"	+ set.headSet(new Integer(50)));    // 범위를 포함 안함
        System.out.println("50보다 큰 값 :"	+ set.tailSet(new Integer(50)));    // 범위 포함
    }
}
