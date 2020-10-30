package text;

import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormat03 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###.##");   // 1,000.99
        DecimalFormat df2 = new DecimalFormat("#.###E0");   // 1.234E6

        try {
            Number num = df.parse("1,234,567.89");  // 문자열 "1,234,567.89"를 숫자로 변환
            System.out.print("1,234,567.89 ->");

            double d = num.doubleValue();   // Number 타입의 1234567.89 을 double 형으로 변환
            System.out.print(d + "->");

            System.out.println(df2.format(num));
        } catch (ParseException e){

        }
    }
}
