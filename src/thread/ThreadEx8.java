package thread;

class ThreadEx8 {
    // main 메서드를 실행하는 쓰레드는 우선순위가 5이므로 이 안에서 생성된 쓰레드도 기본 우선순위는 5
    public static void main(String args[]) {
        ThreadEx8_1 th1 = new ThreadEx8_1();
        ThreadEx8_2 th2 = new ThreadEx8_2();

        th2.setPriority(7); // th2 쓰레드의 우선순위를 7로 지정

        System.out.println("Priority of th1(-) : " + th1.getPriority() );
        System.out.println("Priority of th2(|) : " + th2.getPriority() );
        th1.start();
        th2.start();
    }
}

class ThreadEx8_1 extends Thread {
    public void run() {
        for(int i=0; i < 300; i++) {
            System.out.print("-");
            for(int x=0; x < 10000000; x++);    //작업을 지연시키기 위함
        }
    }
}

class ThreadEx8_2 extends Thread {
    public void run() {
        for(int i=0; i < 300; i++) {
            System.out.print("|");
            for(int x=0; x < 10000000; x++);
        }
    }
}
