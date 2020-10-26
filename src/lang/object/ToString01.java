package lang.object;

/**
 * toString() : 인스턴스에 대한 정보를 문자열로 제공할 목적으로 정의
 * public String toString() {
 *       return getClass().getName() + "@" + Integer.toHexString(hashCode());
 * }
 */
public class ToString01 {

    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();

        // toString을 오버라이딩 하지 않았기때문에 클래스이름+해시코드 출력
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}

class Card {
    String kind;
    int number;

    public Card() {
        this("SPADE", 1);
    }
    public Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }
}