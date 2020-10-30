package text;

import java.text.DecimalFormat;

/**
 * 0 : 10진수(값이 없을 떄는 0)
 * # : 10진수
 * . : 소수점
 * - : 음수부호
 * , : 단위 구분자
 * E : 지수기호
 * ; : 패턴 구분자
 * % : 퍼센트
 * \u2030 : 퍼밀(퍼센트 * 10)
 * \u00A4 : 통화
 * ' : escape 문자
 */
public class DecimalFormat02 {
    public static void main(String[] args) {
        double number = 1234567.89;
        String[] pattern = {"0", "#", "0.0", "#.#", "0000000.0000", };

        for(int i=0; i<pattern.length; i++) {
            DecimalFormat df = new DecimalFormat(pattern[i]);
            System.out.printf("%19s : %s\n", pattern[i], df.format(number));
        }
    }
}
