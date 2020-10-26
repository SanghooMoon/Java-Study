package lang.object;

class Card2 {
    String kind;
    int number;

    public Card2() {
        this("SPADE", 1);
    }
    public Card2(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Card2{" + "kind='" + kind + '\'' + ", number=" + number + '}';
    }
}

public class ToString03 {

    public static void main(String[] args) {
        Card2 c1 = new Card2();
        Card2 c2 = new Card2("Heart", 10);

        // toString을 오버라이딩한 결과값 출력
        System.out.println(c1.toString());  // Card2{kind='SPADE', number=1}
        System.out.println(c2.toString());  // Card2{kind='Heart', number=10}
    }
}

