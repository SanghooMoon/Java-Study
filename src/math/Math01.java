package math;

import static java.lang.Math.*;
import static java.lang.System.*;

/**
 * Math 클래스는 기본적인 수학계산에 유용한 메서드로 구성
 */
public class Math01 {


    public static void main(String[] args) {
        // 올림(ceil), 버림(floor), 반올림(round)
        double val = 90.7552;
        out.println("round("+val+") : " + round(val));                   // 반올림

        val *= 100;
        out.println("round("+val+") : " + round(val));                   // 반올림

        out.println("round("+val+")/100 : " + round(val)/100);           // 반올림
        out.println("round("+val+")/100.0 : " + round(val)/100.0);       // 반올림
        out.println();

        out.printf("ceil(%3.1f)=%3.1f\n", 1.1, ceil(1.1));               // 올림
        out.printf("floor(%3.1f)=%3.1f\n", 1.5, floor(1.5));             // 버림
        out.printf("round(%3.1f)=%d\n", 1.1, round(1.1));                // 반올림
        out.printf("round(%3.1f)=%d\n", 1.5, round(1.5));                // 반올림

        out.printf("rint(%3.1f)=%f\n", 1.5, rint(1.5));                  // 반올림, rint()도 round() 처럼 소수점 첫 째자리에서 반올림, 반환값 double

        out.printf("round(%3.1f)=%d\n", -1.5, round(-1.5));              // 반올림
        out.printf("rint(%3.1f)=%f\n", -1.5, rint(-1.5));                // 반올림, rint() 두 정수의 정 가운데 있는 값은 가장 가까운 짝수 정수 반환(-2)
        out.printf("ceil(%3.1f)=%f\n", -1.5, ceil(-1.5));                // 올림
        out.printf("floor(%3.1f)=%f\n", -1.5, floor(-1.5));              // 버림

        // 절대값 반환
        out.println("abs(-10) : " + abs(-10));                           // 절대값 (10)

        // 최대/최소
        out.println("max(9.5, 9.50001) : " + max(9.5, 9.50001) );        // 최대값 (9.50001)
        out.println("min(0, -1) : " + min(0, -1) );                      // 최소값 (-1)

        // 랜덤(0.0 <= n < 1.0) 임의의 double 반환
        out.println("(0.0 <= n < 1.0) : " + random());
        out.println((int)(random()*10)+1);                          // (1 <= n < 11)
    }
}
