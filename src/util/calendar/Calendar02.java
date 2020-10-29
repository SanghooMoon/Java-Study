package util.calendar;

import java.util.Calendar;

public class Calendar02 {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        date.set(2020, 7 ,31);  // date를 2020년 8월 31일로 지정

        System.out.println(toString(date));
        System.out.println("=== 1일 후 ===");
        date.add(Calendar.DATE, 1);     // 1일 추가
        System.out.println(toString(date));

        System.out.println("=== 6달 전 ===");
        date.add(Calendar.MONTH, -6);
        System.out.println(toString(date));

        // roll 메서드는 월 필드의 값은 변하지 않고 일 필드의 값만 바뀜
        System.out.println("=== 31일 후(roll) ===");
        date.roll(Calendar.DATE, 31);
        System.out.println(toString(date));

        // add 메서드는 일정기간 전후의 일자를 모두 변경경
        System.out.println("=== 31일 후(add) ===");
        date.add(Calendar.DATE, 31);
        System.out.println(toString(date));
    }

    public static String toString(Calendar date) {
        return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH)+1) + "월 " + date.get(Calendar.DATE) + "일";
    }
}
