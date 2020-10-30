package text;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Date 객체에서만 format() 메서드에 사용될 수 있기 때문에 Calendar -> Date로 변환하여 사용하는 예제
 */
public class SimpleDateFormat02 {
    public static void main(String[] args) {
        Calendar cal1 = Calendar.getInstance();
        cal1.set(2020, 4,16);       // 2020년 5월 16, 월은(0~11이기때문에)

        Date day = cal1.getTime();

        SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
        sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        sdf2 = new SimpleDateFormat("''yy년 MMM dd일 E요일");
        sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");

        System.out.println(sdf1.format(day));
        System.out.println(sdf2.format(day));
        System.out.println(sdf3.format(day));
        System.out.println(sdf4.format(day));
    }
}
