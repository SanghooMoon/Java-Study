package util.stringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizer01 {
    public static void main(String[] args) {
        String source = "100,200,300,400,500";
        StringTokenizer st = new StringTokenizer(source, ",");  // source를 구분자(",")로 나누어 토큰 생성

        while(st.hasMoreTokens()){  // 토큰이 남아 있다면
            System.out.println(st.nextToken()); // 토큰 반환
        }
    }
}
