package exception;

public class Exception08 {

    /**
     *  메서드에 예외 선언
     */
    public static void main(String[] args) throws Exception {
        method();
    }
    static void method() throws Exception {
        method2();
    }

    static void method2() throws Exception {
        throw new Exception();
    }
}
