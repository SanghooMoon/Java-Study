package math;

/**
 * StrictMath : 성능은 다시 포기하는 대신, 어떤 OS에서 실행되어도 항상 같은 결과를 얻도록 Math클래스를 새로 작성한 클래스
 */
public class StrictMath01 {
    public static void main(String[] args) {
        System.out.println(StrictMath.round(1.5));
        System.out.println(StrictMath.ceil(1.5));
        System.out.println(StrictMath.floor(1.5));
    }
}
