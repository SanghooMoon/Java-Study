package util.stringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizer02 {
    public static void main(String[] args) {
        String expression = "x=100*(200+300)/2";
        // StringTokenizer는 단 한 문자의 구분자만 사용할 수 있기 때문에 "+-*/=()" 전체가 하나의 구분자가 아니라 각각의 문자가 모두 구분자.
        // 3번째 매개변수인 returnDelims 를 true로 하면 구분자도 토큰으로 간주
        StringTokenizer st = new StringTokenizer(expression, "+-*/=()", true);

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
