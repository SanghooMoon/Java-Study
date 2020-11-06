package generics;

import java.util.Collections;

/**
 * 지네릭스 : 다양한 타입의 객체들을 다루는 메서드나 컬렉션 클래스에 컴파일 시의 타입체크를 해주는 기능
 * 타입 안정성 제공
 * 타입체크와 형변환을 생략할 수 있으므로 코드가 간결해짐
 * 즉, 다룰 객체의 타입을 미리 명시해줌으로써 번거로운 형변환을 줄여준다.
 *
 * 지네릭스의 용어
 * Box<T> : 지네릭 클래스. 'T의 Box' 또는 'T Box'라고 읽는다
 * T : 타입 변수 또는 타입 매개변수(T는 타입 문자)
 * Box : 원시 타입(raw Type)
 */
// 지네릭 클래스 형태
class Box2<T>{
    T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
public class Generics01 {
    public static void main(String[] args) {
        // 지네릭 클래스 선언 및 생성
        Box2<String> b = new Box2<String>();  // 타입 T 대신, 실제 타입을 지정
//        b.setItem(new Object());    // 에러, 타입이 String으로 지정해주었기 때문에
         b.setItem("ABC");
         String item = b.getItem(); // 형 변환이 필요 없음

        Box2 b2 = new Box2();     // 호환을 위해 타입을 지정하지 않고도 객체생성가능, T는 Object로 간주
        b2.setItem("ABC");      // 모두 허용, Object는 최상위 클래스이기 때문
        b2.setItem(new Object());

    }
}
