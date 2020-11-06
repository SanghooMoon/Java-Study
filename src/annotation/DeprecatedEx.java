package annotation;

/**
 * @Deprecated
 * 더 이상 사용되지 않는 필드나 메서드에 @Deprecated를 붙임. 이 애너테이션이 붙은 대상은 다른 것으로 대체되었으니 더 이상 사용을 권장하지 않음
 * API문서에 붙어있음.
 *
 * 만일 @Deprecated가 붙은 대상을 사용하는 코드를 작성하면 컴파일할 때 메시지가 나타남, 컴파일을 못하는건 아님(강제성 X)
 */
class NewClass{
    int newField;

    int getNewField() {
        return newField;
    }

    @Deprecated
    int oldField;

    @Deprecated
    int getOldField() {
        return oldField;
    }
}
public class DeprecatedEx {
    public static void main(String args[]) {
        NewClass nc = new NewClass();

        nc.oldField = 10;                     //@Depreacted가 붙은 대상을 사용
        System.out.println(nc.getOldField()); //@Depreacted가 붙은 대상을 사용
    }
}
