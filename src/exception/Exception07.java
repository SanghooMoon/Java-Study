package exception;

public class Exception07 {

    /**
     *  예외 발생시키기
     */
    public static void main(String[] args) {
        // 1. 먼저 연산자 new를 이용해서 발생시키려는 예외 클래스의 객체를 만든다음
        // 2. 키워드 throw를 이용해서 예외를 발생 시킨다.
        // Exception 인스턴스를 생성할 때, 생성자에 String을 넣어주면 이 String이 Exception 인스턴스에 메시지로 저장, getMessage()로 얻을수 있음
        try {
            Exception e = new Exception("고의로 예외 발생");
            throw e;
//            throw new Exception("고의로 예외 발생");
        } catch (Exception e){
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
        }
    }
}
