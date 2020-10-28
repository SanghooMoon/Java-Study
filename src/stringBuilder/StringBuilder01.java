package stringBuilder;

/**
 * StringBuffer는 멀티쓰레드에 안전하도록 동기화되어있다. 동기화는 StringBuffer의 성능을 떨어뜨린다.
 * 멀티쓰레드로 작성된 프로그램이 아닌 경우 StringBuffer의 동기화는 불필요하게 성능만 떨어뜨린다.
 *
 * 그래서 StringBuffer에서 쓰레드의 동기화만 뺀 StringBuilder가 추가. 완전히 똑같은 기능으로 작성되어서 소스코드만 변경하면된다.
 *
 * StringBuilder : Thread-Safe 하지 않다. 멀티 쓰레드 지원하지 않음.
 * StringBuffer : Thread-Safe 하다. 멀티 쓰레드 지원함.
 * 즉, 동기화 지원의 유무.
 * StringBuilder는 동기화를 고려하지 않는 상황에서 사용.(Thread를 사용하지 않는 상황.) 문자열 연산이 많은 싱글 쓰레드 환경.
 * StringBuffer는 동기화가 필요한 멀티 쓰레드 환경에서 사용. 문자열 연산이 많은 멀티 쓰레드 환경.
 */
public class StringBuilder01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("abc");
    }
}
