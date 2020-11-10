package thread;

/**
 * 호출 스택
 *
 * throwException()
 * run()
 *
 * main 쓰레드의 호출스택이 없는 이유는 main쓰레드가 종료되었기 때문
 */
class ThreadEx2 {
    public static void main(String args[]) throws Exception {
        ThreadEx2_1 t1 = new ThreadEx2_1();
        t1.start();
    }
}

class ThreadEx2_1 extends Thread {
    public void run() {
        throwException();
    }

    public void throwException() {
        try {
            throw new Exception();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}