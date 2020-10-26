package lang.object;

class Value {
    int value;

    Value(int value) {
        this.value = value;
    }
}

/**
 * equals 메서드는 == 으로 비교, 참조변수의 값으로 비교하기 때문에 각각의 객체를 인스턴스하여 비교했을땐 false,
 * v2에 v1의 주소값을 대입하여 같은 주소값이 되면 true
 *
 * 실제 구현 로직(^ + click 으로 확인가능)
 * public boolean equals(Object obj) {
 *         return (this == obj);
 * }
 */
public class Equals01 {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(20);

        if(v1.equals(v2))
            System.out.println("v1과 v2는 같습니다.");
        else
            System.out.println("v1과 v2는 다릅니다.");

        v2 = v1;

        if(v1.equals(v2))
            System.out.println("v1과 v2는 같습니다.");
        else
            System.out.println("v1과 v2는 다릅니다.");
    }
}
