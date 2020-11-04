package collections;

import java.util.*;

public class Bingo {
    public static void main(String[] args) {
        Set set = new HashSet();            // HashSet 생성
//          Set set = new LinkedHashSet();
        int[][] board = new int[5][5];      // 빙고판 생성

        // set이 모두 채워질때까지 반복
        for(int i=0; set.size() < 25; i++) {
            set.add((int)(Math.random()*50)+1+"");
        }

        //
        Iterator it = set.iterator();

        for(int i=0; i < board.length; i++) {
            for(int j=0; j < board[i].length; j++) {
                board[i][j] = Integer.parseInt((String)it.next());  // next() 메서드는 Object타입으로 형 변환되서 원래의 타입으로 형 변환
                System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]);
            }
            System.out.println();
        }
        /*
            HashSet은 저장순서를 보장하지 않기때문에 자체적인 저장방식에 따라 저장되어 비슷한 방식으로 배치가된다.
            Bingo를 만드는 경우에는 HashSet보다 저장순서를 저장하는 LinkedHashSet이 보다 바람직하다.
         */
    }
}
