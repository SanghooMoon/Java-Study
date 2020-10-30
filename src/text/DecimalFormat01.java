package text;

import java.text.DecimalFormat;

/**
 *  DecimalFormat : 형식화 클래스 중에서 숫자를 형식화 하는데 사용
 */
public class DecimalFormat01 {
    public static void main(String[] args) {

        double number = 1234567.89;
        DecimalFormat df = new DecimalFormat("#.#E0");  // DecimalFormat 객체를 이용하여 패턴 지정
        String result = df.format(number);
        System.out.println(result);
    }
}
