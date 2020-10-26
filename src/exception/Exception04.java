package exception;

public class Exception04 {

    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0);                // 0으로 나눠서 ArithmeticException 발생
            System.out.println(5);                  // 실행되지 않음.
        } catch (ArithmeticException ae){           // 예외클래스 참조변수로 선언
            if(ae instanceof ArithmeticException){  // 타입확인 후 예외처리
                System.out.println("예외");
            }
            System.out.println("ArithmeticException");
        } catch (Exception e) {                     // 상단에 처리해놓은 ArithmeticException를 제외한 모든 예외를 처리
            System.out.println("Exception");        // 실행되지 않음
        }
        System.out.println(6);
    }
}
