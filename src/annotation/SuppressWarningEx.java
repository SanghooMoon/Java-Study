package annotation;

import java.util.ArrayList;

/**
 * @SuppressWarnings
 * 컴파일러가 보여주는 경고메시지가 나타나지 않게 억제하는 애너테이션
 *
 * deprecation : @Deprecated 가 붙은 대상을 사용해서 발생하는 경고 억제
 * unchecked : 지네릭스 타입을 지정하지 않았을 때 발생하는 경고
 * rawtypes : 지네릭스를 사용하지 않아서 발생하는 경고
 * varargs : 가변인자의 타입이 지네릭 타입일 때 발생하는 경고 억제
 */
class NewClass2{
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
public class SuppressWarningEx {
    @SuppressWarnings("deprecation")     // deprecation관련 경고를 억제
    public static void main(String args[]) {
        NewClass2 nc = new NewClass2();

        nc.oldField = 10;                     //@Depreacted가 붙은 대상을 사용
        System.out.println(nc.getOldField()); //@Depreacted가 붙은 대상을 사용

        @SuppressWarnings("unchecked")               // 지네릭스 관련 경고를 억제
        ArrayList<NewClass2> list = new ArrayList();  // 타입을 지정하지 않음.
        list.add(nc);
    }
}
