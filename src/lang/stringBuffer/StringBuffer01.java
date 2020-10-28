package lang.stringBuffer;

/**
 * StringBuffer vs String
 * 가변객체  vs 불변객체
 */
public class StringBuffer01 {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");

        /*
        StringBuffer클래스는 equals()를 오버라이딩 하지 않아서 eqauls()메서드를 사용해도 등가비교연산자(==)로 비교한 것과 같은 결과.
         */
        System.out.println("sb==sb2 :" + (sb==sb2));                // false
        System.out.println("sb.equals(sb2) :" + (sb.equals(sb2)));  // false

        // StringBuffer의 문자열을 비교하기 위해서는 toString()을 호출하여 eqauls()를 통해 비교해야합니다.
        //StringBuffer의 내용을 String으로 변환
        String s = sb.toString();       // String s = new String(sb); 와 동일
        String s2 = sb2.toString();

        System.out.println("s.equals(s2) : " + s.equals(s2));       // true
    }
}
