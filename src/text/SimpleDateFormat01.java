package text;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * SimpleDateFormat : 날짜와 시간을 쉽게 형식화 하기위해 사용
 * 패턴에 사용되는 기호 : https://docs.oracle.com/javase/8/docs/api/index.html
 * y : 연도
 * M : 월(1~12 또는 1월~12월)
 * w : 년의 몇 번째 주(1~53)
 * W : 월의 몇 번째 주(1~5)
 * D : 년의 몇 번째 일(1~366)
 * d : 월의 몇 번째 일(1~31)
 * F : 월의 몇 번째 요일(1~5)
 * E : 요일
 * a : 오전/오후(AM,PM)
 * H : 시간(0~23)
 * k : 시간(1~24)
 * K : 시간(0~11)
 * h : 시간(1~12)
 * m : 분(0~59)
 * s : 초(0~59)
 */
public class SimpleDateFormat01 {
    public static void main(String[] args) {
        Date today = new Date();    // 현재 날짜와 시간

        SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
        SimpleDateFormat sdf5, sdf6, sdf7, sdf8, sdf9;

        sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        sdf2 = new SimpleDateFormat("''yy년 MMM dd일 E요일");
        sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");

        sdf5 = new SimpleDateFormat("오늘은 올 해의 D번째 날입니다.");
        sdf6 = new SimpleDateFormat("오늘은 이 달의 d번째 날입니다.");
        sdf7 = new SimpleDateFormat("오늘은 올 해의 w번째 주입니다.");
        sdf8 = new SimpleDateFormat("오늘은 이 달의 W번째 주입니다.");
        sdf9 = new SimpleDateFormat("오늘은 이 달의 F번째 E요일입니다.");

        System.out.println(sdf1.format(today)); // 2020-10-30
        System.out.println(sdf2.format(today)); // '20년 10월 30일 금요일
        System.out.println(sdf3.format(today)); // 2020-10-30 13:28:59.680
        System.out.println(sdf4.format(today)); // 2020-10-30 13:28:59 오후
        System.out.println();
        System.out.println(sdf5.format(today)); // 오늘은 올해의 304번째 날입니다.
        System.out.println(sdf6.format(today)); // 오늘은 이 달의 30번째 날입니다.
        System.out.println(sdf7.format(today)); // 오늘은 올 해의 44번째 주입니다.
        System.out.println(sdf8.format(today)); // 오늘은 이 달의 5번째 주입니다.
        System.out.println(sdf9.format(today)); // 오늘은 이 달의 5번째 금요일입니다.
    }
}
