package lang.object;

/**
 * getClass() : 자신이 속삭 클래스의 Class 객체를 반환하는 메서드
 * Class 객체는 클래스의 모든 정보를 담고 있으며 클래스당 1개만 존재
 */

final class Card3 {
    String kind;
    int num;

    public Card3() {
        this("SPADE", 1);
    }

    public Card3(String kind, int num) {
        this.kind = kind;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Card3{" + "kind='" + kind + '\'' + ", num=" + num + '}';
    }
}
public class GetClass {
    public static void main(String[] args) throws Exception {
        Card3 c = new Card3("Heart", 3);    // new 연산자로 객체 생성
        Card3 c2 = Card3.class.newInstance();         // Class 객체를 총해서 객체 생성

        Class cObj = c.getClass();

        System.out.println(c);                          // Card3{kind='Heart', num=3}
        System.out.println(c2);                         // Card3{kind='SPADE', num=1}
        System.out.println(cObj.getName());             // lang.object.Card3
        System.out.println(cObj.toGenericString());     // final class lang.object.Card3
        System.out.println(cObj.toString());            // class lang.object.Card3
    }
}
