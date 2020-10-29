package util.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex02 {

    public static void main(String[] args) {
        String source = "HP:011-1111-1111, HOME:02-999-9999";
        String pattern = "(0\\d{1,2})-(\\d{3,4})-(\\d{4})";     // 0으로 시작하는 최소 2자리 최대 3자리(0포함), 최소3자리 최대4자리의 숫자, 4자리의 숫자

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(source);

        int i = 0;
        while(m.find()) {
            // group() 또는 group(0) 은 그룹으로 매칭된 문자열 전체를 나누어지지 않은채로 반환
            System.out.println(++i + ": " + m.group() + " -> " + m.group(1) + "," + m.group(2) + "," + m.group(3));
        }
    }
}
