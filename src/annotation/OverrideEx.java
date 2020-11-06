package annotation;

/**
 * @Override
 * 메서드 앞에만 붙일 수 있는 애너테이션, 조상의 메서드를 오버라이딩하는 것이라는걸 컴파일러에게 알려주는 역할
 */
class Parent {
    void parentMethod(){}
}
class Child extends Parent {
//    void parentmethod(){}   // 이처럼 이름을 잘못적으면 컴파일러는 잘못된 메서드인지 모르고, 새로운 이름의 메서드인줄 안다.

    @Override   // 이렇게 애너테이션을 붙이면 컴파일러가 같은 이름의 메서드가 조상에 있는지 확인하고 없으면, 에러메시지(method does not override or implement a method from a supertype) 출력
    void parentMethod(){}
}
public class OverrideEx {
    public static void main(String[] args) {

    }
}
