package thread;

/**
 * 호출스택
 *
 * throwException()
 * run()
 * main()
 *
 * 쓰레드가 새로 생성되지 않음, 그 이유는 main()에서의 run()이 호출 되었을 뿐임
 */
class ThreadEx3 {
    public static void main(String args[]) throws Exception {
        ThreadEx3_1 t1 = new ThreadEx3_1();
        t1.run();
    }
}

class ThreadEx3_1 extends Thread {
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

