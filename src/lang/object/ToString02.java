package lang.object;

import java.util.Date;

public class ToString02 {

    public static void main(String[] args) {
        String str = new String("KOREA");
        Date today = new Date();

        /*
        String 클래스의 toString()은 String 인스턴스가 가지고있는 문자열을 반환하도록 오버라이딩 되어있음
        Date 클래스의 경우, Date 인스턴스가 갖고있는 날짜와 시간을 분자열로 반환하도록 오버라이딩
         */
        System.out.println(str);                // KOREA
        System.out.println(str.toString());     // KOREA
        System.out.println(today);              // Mon Oct 26 20:51:13 KST 2020
        System.out.println(today.toString());   // Mon Oct 26 20:51:13 KST 2020
    }
}
