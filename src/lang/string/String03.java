package lang.string;

/**
 * String 클래스의 생성자와 메서드의 목록
 */
public class String03 {
    public static void main(String[] args) {

        // compareTo(String str) : 문자열(str)과 사전순서로 비교, 같으면 0, 이전이면 음수, 이후이면 양수반환
        int i = "aaa".compareTo("aaa");     // 0    (동일하기때문에 0)
        int i2 = "aaa".compareTo("bbb");    // -1   (bbb보다 aaa가 이전이기 때문에 -1)
        int i3= "bbb".compareTo("aaa");     // 1    (aaa보다 bbb가 이후이기 때문에 1)

        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);

        // contains(CharSequence s) : 지정된 문자열이 포함되어있는지 검사
        String s = "abcdefg";
        System.out.println(s.contains("ab"));   // true ("ab"가 포함되어있기 때문에 true)

        // endsWith(String suffix) : 지정된 문자열로 끝나는지 검사
        String file = "hello.txt";
        System.out.println(file.endsWith("txt"));   // true ("txt"로 끝나기 때문에 true)

        // equalsIgnoreCase(String str) : 문자열을 대소문자 구분없이 비교한다.
        String s2 = "hello";
        System.out.println(s2.equalsIgnoreCase("hello"));
        System.out.println(s2.equalsIgnoreCase("Hello"));   // 대소문자 구분없이 비교하므로 true

    }
}
