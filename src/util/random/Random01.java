package util.random;

import java.util.Random;

/**
 * 난수를 얻는 방법은 이전에 배운 Math.random() 이 떠오른다. 이외에도 Random 클래스를 사용하면 난수를 얻을 수 있다.
 * 사실 Math.random()은 내부적으로 Random 클래스를 인스턴스를 생성해서 사용하는 것이므로 편한것 사용하면 된다.
 */
public class Random01 {
    public static void main(String[] args) {
        // 동일한 문장
        double randNum = Math.random();
        double randNum2 = new Random().nextDouble();
        System.out.println(randNum);
        System.out.println(randNum2);

        // 1~6사이의 정수를 난수로 얻어보자
        int num = (int)(Math.random() * 6) + 1;
        int num2 = new Random().nextInt(6) + 1; // nextInt(6) : 0~6사이의 정수를 반환
        System.out.println(num);
        System.out.println(num2);

    }
}