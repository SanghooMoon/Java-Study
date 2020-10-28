package util.objects;

import java.util.Objects;

/**
 * 유용한 클래스(java.util 패키지)
 */
public class Objects01 {
    /*
    Objects 클래스 : Object 클래스의 보조 클래스로 Math 클래스처럼 모든 메서드가 'static'
    객체의 비교나 null 체크에 유용
     */

    // isNull() : 해당 객체가 널인지 확인해서 null 이면 true, 아니면 false
    // nonNull() : isNull()과 정반대의 일을 한다. 즉, !Objects.isNull(obj) 와 같음
    // requireNonNull() : 해당 객체가 널이 아니어야 하는 경우 사용, 객체가 null 이면 NullPointerException을 발생, 두번째 매개변수는 예외메시지

    // 매개변수 유효성 검사 > 이전 방식
    public void SetName(String name){
        if(name == null){
            throw new NullPointerException("name은 null일 수 없습니다.");
        }
//        this.name = name;
    }
    // util.Objects 클래스 활용
    public void SetName2(String name){
//        this.name = Objects.requireNonNull(name, "name은 null일 수 없습니다.");
    }
}
