package util.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex01 {
    public static void main(String[] args) {
        String[] data = {"bat", "baby", "bonus", "cA", "ca", "co", "c.", "c0", "car", "combat", "count", "date", "disc"};

        // 정규식을 매개변수로 Pattern 클래스의 static 메서드인 Pattern compile(String regex)을 호출하여 Pattern 인스턴스를 얻는다.
        Pattern p = Pattern.compile("c[a-z]*"); // c로 시작하는 영단어

        for(int i=0; i< data.length; i++) {
            // 정규식으로 비교할 대상을 매개변수로 Pattern 클래스의 Matcher matcher(CharSequence input)을 호출해서 Matcher 인스턴스를 얻는다.
            Matcher m = p.matcher((data[i]));

            // Matcher 인스턴스에 boolean matches()를 호출하여 정규식에 부합하는지 확인한다.
            if(m.matches())
                System.out.print(data[i] + ",");
        }
    }
}
/**
 *  c[a-z]*     : c로 시작하는 영단어
 *  c[a-z]      : c로 시작하는 두 자리 영단어
 *  c[a-zA-Z]   : c로 시작하는 두 자리 영단어(대소문자 구분안함)
 *
 *  c[a-zA-Z0-9] : c로 시작하고 숫자와 영어로 조합된 두 글자
 *  c\w
 *
 *  .*          : 모든 문자열
 *  c.          : c로 시작하는 두 자리 문자열
 *  c.*         : c로 시작하는 모든 문자열(기호 포함)
 *  c\.         : c.과 일치하는 문자열
 *
 *  c\d         : c와 숫자로 구성된 두 자리 문자열
 *  c[0-9]
 *
 *  c.*t        : c로 시작하고 t로 끝나는 모든 문자열
 *
 *  [b|c].*     : b 또는 c로 시작하는 문자열
 *  [bc].*
 *  [b-c].*
 *
 *  [^b|c].*     : b 또는 c로 시작하지 않는 문자열
 *  [^bc].*
 *  [^b-c].*
 *
 *  .*a.*       : a를 포함하는 모든 문자열( * : 0 또는 그 이상의 문자 )
 *  .*a.+       : a를 포함하는 모든 문자열( + : 1또는 그 이상의 문자, *과 달리 반드시 하나 이상의 문자가 있어야 하므로 a로 끝나는 단어 포함 X)
 *  [b|c].{2}   : b 또는 c로 시작하는 세 자리 문자열, b|c 다음에 두 자리이므로 총 세 자리
 */
