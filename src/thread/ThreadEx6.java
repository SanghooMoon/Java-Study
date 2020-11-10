package thread;

import javax.swing.*;

/**
 *  하나의 쓰레드로 사용자의 입력을 받는 작업과 화면에 숫자를 출력하는 작업을 처리하는 소스
 *  사용자가 입력을 마치기 전 까지는 화면에 숫자가 출력되지 않다가 사용자가 입력을 마치고서야 출력. 즉 대기시간 발생
 */
class ThreadEx6 {
    public static void main(String[] args) throws Exception
    {
        String input = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
        System.out.println("입력하신 값은 " + input + "입니다.");

        for(int i=10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch(Exception e ) {}
        }
    }
}
