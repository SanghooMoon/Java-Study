package enums;

/**
 * enums(열거형)
 * 열거형은 서로 관련된 상수를 편리하게 선언하기 위한 것으로 여러 상수를 정의할 떄 사용하면 유용하다.
 * 자바의 열거형은 타입에 안전한 열거형인데, 실제 값이 같아도 타입이 다르면 컴파일 에러가 발생하기 때문.
 * 상수의 값이 바뀌면 해당 상수를 참조하는 모든 소스를 다시 컴파일해야 하는데 열거형 상수를 사용하면 기존의 소스를 재컴파일하지 않아도 됌
 *
 * getDeclaringClass() : 열거형의 Class 객체를 반환
 * name() : 열거형 상수의 이름을 문자열로 반환
 * ordinal() : 열서형 상수가 정의된 순서를 반환(0부터 시작)
 * valueOf() : 지정된 열거형에서 name과 일치하는 열거형 상수를 반환
 */
class Card {
    /*
    static final int CLOVER = 0;
    static final int HEART = 1;
    static final int DIAMOND = 2;
    static final int SPADE = 3;

    static final int TWO = 2;
    static final int THREE = 3;
    static final int FOUR = 4;

    final int kind;
    final int num;
     */
//    ↓↓
    enum Kind { CLOVER, HEART, DIAMOND, SPADE };
    enum Value { TWO, THREE, FOUR };

//    final Kind kind;    // 타입이 Kind임에 유의
//    final Value Value;
}
public class Enum01 {

}
