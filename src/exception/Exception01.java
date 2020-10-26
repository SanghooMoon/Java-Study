package exception;

public class Exception01 {

    public static void main(String[] args) {
        int number = 100;
        int result = 0;

        // ArithmeticException 예외 발생 -> 산술연산과정에서 오류(정수는 0으로 나누지못함)
//        for (int i=0; i<10; i++){
//            result = number / (int)(Math.random() * 10);
//            System.out.println(result);
//        }

        for (int i = 0; i < 10; i++) {
            try {
                result = number / (int) (Math.random() * 10);
                System.out.println(result);
            } catch (ArithmeticException e) {
                System.out.println("0");    // 예외가 발생하면 실행되는 코드
            }
        }
    }
}
