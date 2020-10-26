package lang.object;

/**
 * hashCode() : 그 값이 저장된 위치를 알려주는 해시코드를 반환
 * 서로 다른 두 객체는 절대 같은 해시코드를 가질 수 없음
 */
public class HashCode01 {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        // String 클래스는 문자열의 내용이 같으면 동일한 해시코드를 반환하도록 오버라이딩되어있기때문에 같은 값
        System.out.println(str1.equals(str2));  // true
        System.out.println(str1.hashCode());    // 1234
        System.out.println(str2.hashCode());    // 1234

        // 반면 System.identityHashCode()는 Object클래스의 hashCode()처럼 모든 객체에 대해 항상 다른 해시코드값 반환
        // 그래서 str1 과 str2는 해시코드는 같지만 다른객체임을 알 수 있음.
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
    }
}
