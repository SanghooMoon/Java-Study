package thread;

import javax.swing.*;

/**
 * 두 개의 쓰레드로 나누어서 처리
 * 사용자가 입력을 마치지 않아도 숫자는 출력되고 있음.
 */
class ThreadEx7 {
    public static void main(String[] args) throws Exception 	{
        ThreadEx7_1 th1 = new ThreadEx7_1();
        th1.start();

        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력하신 값은 " + input + "입니다.");
    }
}

class ThreadEx7_1 extends Thread {
    public void run() {
        for(int i=10; i > 0; i--) {
            System.out.println(i);
            try {
                sleep(1000);
            } catch(Exception e ) {}
        }
    }
}
