package text;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * parse 메서드는 문자열을 Date형식으로 형 변환
 */
public class SimpleDateFormat03 {
    public static void main(String[] args) {
        // DateFormat 은 추상클래스로 인스턴스화 못함
        DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
        DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");

        // 지정된 형식과 입력된 형식이 일치하지 않는 경우에는 예외가 발생하므로 적절한 예외처리가 필요
        try {
            Date date = df.parse("2015년 11월 23일");
            System.out.println(df2.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
