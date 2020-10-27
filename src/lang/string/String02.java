package lang.string;

/**
 * 빈 문자열
 */
public class String02 {
    public static void main(String[] args) {
        // 길이가 0인 char 배열 생성
        char[] arr = new char[0];       // char[] arr = {}; 와 같다
        String s = new String(arr);     // String s = new String(""); 와 같다

        System.out.println("arr.length= " + arr.length);
        System.out.println("@@@"+ s + "@@@");
    }
}
