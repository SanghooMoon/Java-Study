package exception;

public class Exception03 {

    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0);    // 0으로 나눠서 ArithmeticException 발생
            System.out.println(5);      // 실행되지 않음.
        } catch (Exception e){          // 모든 예외 클래스는 Exception 클래스의 자손이므로 어떤 종류의 예외가 발생하더라도 처리됨
            System.out.println("예외");
        }
        System.out.println(6);
    }
}
