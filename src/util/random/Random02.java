package util.random;

import java.util.Random;

public class Random02 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] number = new int[100];
        int[] counter = new int[10];

        for(int i=0; i<number.length; i++){
//            System.out.print(number[i] = (int)(Math.random() * 10));
//            0 <= x < 10
            System.out.print(number[i] = rand.nextInt(10));   // 0 ~ 10 난수를 number 배열에 각각 저장
        }
        System.out.println();

        for(int i=0; i<number.length; i++){
            counter[number[i]]++;   // 랜덤으로 나온 수의 인덱스에 ++ 누적
        }
        for(int i=0; i< counter.length; i++) {
            System.out.println(i + "의 개수 :" + printGraph('#', counter[i]) + " " + counter[i]);
        }
    }

    private static String printGraph(char c, int value) {
        char[] bar = new char[value];   // 랜덤으로 나온 수 개수만큼 char 배열 생성

        // 생성된 배열 만큼 '#' 문자열 저장
        for(int i=0; i< bar.length; i++){
            bar[i] = c;
        }

        return new String(bar); // 문자열로 반환
    }
}
