package util.calendar;

import java.util.Calendar;

public class Calendar01 {
    public static void main(String[] args) {

        // Calendar 는 추상 클래스이기 때문에 직접 인스터스하지 못하고, 메서드를 통해 인스턴스를 얻는다.
        // 기본적으로 현재날짜와 시간으로 설정.
        Calendar today = Calendar.getInstance();

        System.out.println("이 해의 년도 : " + today.get(Calendar.YEAR));
        System.out.println("월(0~11) : " + today.get(Calendar.MONTH));   // 9 -> 10월
        System.out.println("이 해의 몇째 주 : " + today.get(Calendar.WEEK_OF_YEAR));
        System.out.println("이 달의 몇째 주 : " + today.get(Calendar.WEEK_OF_MONTH));

        // DATE == DAY_OF_MONTH
        System.out.println("이 달의 몇일 : " + today.get(Calendar.DAY_OF_MONTH));
        System.out.println("이 달의 몇일 : " + today.get(Calendar.DATE));

        System.out.println("이 해의 몇일 : " + today.get(Calendar.DAY_OF_YEAR));
        System.out.println("요일(1~7, 1: 일요일) : " + today.get(Calendar.DAY_OF_WEEK));         // 5 -> 목
        System.out.println("이 달의 몇 째 요일 : " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));    // 5 -> 5번째 N요일
        System.out.println("오전_오후(0: 오전, 1: 오후) : " + today.get(Calendar.AM_PM));

        System.out.println("시간(0~11) : " + today.get(Calendar.HOUR));
        System.out.println("시간(0~23) : " + today.get(Calendar.HOUR_OF_DAY));
        System.out.println("분(0~59) : " + today.get(Calendar.MINUTE));
        System.out.println("초(0~59) : " + today.get(Calendar.SECOND));
        System.out.println("1000분의 1초(0~999) : " + today.get(Calendar.MILLISECOND));

        // 천분의 1초를 시간으로 표시하기 위해 3600000으로 나누었다.(1시간 = 60 * 60초)
        System.out.println("TimeZone(-12~+12) : " + (today.get(Calendar.ZONE_OFFSET) / (60*60*1000)));

        // 이 달의 마지막 일 찾기
        System.out.println("이 달의 마지막 날 : " + today.getActualMaximum(Calendar.DATE));

    }
}
