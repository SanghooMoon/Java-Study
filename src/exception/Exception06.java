package exception;

public class Exception06 {

    /**
     *  멀티 catch 블럭 '|' 기호를 활용, 조상-자손관계면 에러(불필요한중복코드이기때문)
     */
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(5);
        } catch (ArithmeticException | IllegalStateException e){    // 멀티 catch
            e.printStackTrace();
            System.out.println("예외메시지" + e.getMessage());
        }
        System.out.println(6);
    }
}
