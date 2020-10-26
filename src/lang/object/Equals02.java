package lang.object;

class Person {
    long id;

    public Person(long id) {
        this.id = id;
    }

    // 참조변수가 같은 지 판단하는 기능말고, 인스턴스가 가지고있는 값을 비교하기위해 equals 메서드 오버라이드
    @Override
    public boolean equals(Object o) {
        if(o instanceof Person){            // 매개변수로 받은 객체가 Person 타입이면
            return id == ((Person)o).id;    // Person타입으로 형변환 후 id값을 비교연산 후 리턴
        } else {
            return false;                   // 타입이 Person이 아니면 비교할 필요도 없다.
        }
    }

}

public class Equals02 {
    public static void main(String[] args) {
        Person p1 = new Person(1234567L);
        Person p2 = new Person(1234567L);

        if(p1==p2)  // 참조변수 즉 주소값이 다르기때문에 다른 사람 출력
            System.out.println("같은 사람입니다.");
        else
            System.out.println("다른 사람입니다.");

        if(p1.equals(p2)){  // 오버라이드한 equals는 값을 비교하기때문에 같은 사람 출력
            System.out.println("같은 값 사람입니다.");
        } else {
            System.out.println("다른 값 사람입니다.");
        }
    }
}
