package collections;

import java.util.HashSet;
import java.util.Objects;

/**
 * HashSet02 클래스와 달리 두 인스턴스를 같은것으로 인식하게 하기
 * HastSet의 add 메서드는 새로운 요소를 추가하기 전에 기존에 저장된 요소와 같은 것인지 판별하기 위해 추가하려는 요소의 equals()와 hashCode()를 호출
 * 그렇기 때문에 목적에 맞게 eqauls(), hashCode()를 오버라이딩 해야함
 */
public class HashSet03 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add(new String("abc"));
        set.add(new String("abc"));
        set.add(new Person2("David",10));
        set.add(new Person2("David",10));

        System.out.println(set);    // "abc", Daved:10

    }
}

// Person 클래스
class Person2 {
    String name;
    int age;

    Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // eqauls 메서드를 오버라이딩 : String 클래스에서 같은 내용의 문자열에 대한 eqauls()의 결과가 true인 것 처럼, Person2 객체에서도 name과 age가 같으면 true를 반환하도록 오버라이딩
    public boolean equals(Object obj) {
        if(obj instanceof Person2) {    // 비교대상이 Person2 객체이면
            Person2 tmp = (Person2)obj; // 참조변수에 캐스팅하여 담아주고
            return name.equals(tmp.name) && age==tmp.age;   // 필드(멤버변수)의 값이 모두 일치하면 true, 그렇지않으면 false를 리턴
        }

        return false;
    }
    // String 클래스의 hashcode는 두 문자열이 같으면 같은 hashCode를 반환하게 오버라이딩 되있으므로 Person객체에서의 hashCode()도 문자열을 통해 반환하도록 오버라이딩
    public int hashCode() {
        return (name+age).hashCode();   // 문자열 + 정수형 = 문자열
//        return Objects.hash(name, age); 위와 동일
    }

    public String toString() {
        return name +":"+ age;
    }
}
