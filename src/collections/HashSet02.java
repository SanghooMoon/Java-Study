package collections;

import java.util.HashSet;

public class HashSet02 {
    public static void main(String[] args) {
        HashSet set = new HashSet();    // HashSet 생성

        // 입력
        set.add("abc");
        set.add("abc");
        set.add(new Person("David",10));
        set.add(new Person("David",10));

        System.out.println(set);    // Set은 중복을 저장하지 않기때문에 "abc"는 한번만 출력이된다.
                                    // 하지만 Person 인스턴스는 2번 출력되는데 두 인스턴스는 서로 다른 주소지를 가지고있기 때문에 각각의 객체이다.
    }
}

// Person 클래스
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name +":"+ age;
    }
}
