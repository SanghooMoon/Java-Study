package collections;

import java.util.Stack;

public class Stack01 {
    // 필드
    public static Stack back    = new Stack();
    public static Stack forward = new Stack();

    // main()
    public static void main(String[] args) {
        goURL("1.네이트");
        goURL("2.야후");
        goURL("3.네이버");
        goURL("4.다음");

        printStatus();

        goBack();
        System.out.println("= 뒤로가기 버튼을 누른 후 =");
        printStatus();

        goBack();
        System.out.println("= '뒤로' 버튼을 누른 후 =");
        printStatus();

        goForward();
        System.out.println("= '앞으로' 버튼을 누른 후 =");
        printStatus();

        goURL("codechobo.com");
        System.out.println("= 새로운 주소로 이동 후 =");
        printStatus();
    }

    // 상태를 출력하는 메서드
    public static void printStatus() {
        System.out.println("back:"+back);
        System.out.println("forward:"+forward);
        System.out.println("현재화면은 '" + back.peek()+"' 입니다.");
        System.out.println();
    }

    // 이동하는 메서드
    public static void goURL(String url){
        back.push(url);         // back 스택에 url 삽입
        if(!forward.empty())    // forward가 비어있지않다면 forward clear()
            forward.clear();
    }
    // 앞으로
    public static void goForward(){
        if(!forward.empty())            // 앞으로 갈 스택이 있다면, forward 스택을 pop 하여 back에 저장, 즉 앞으로 이동
            back.push(forward.pop());
    }
    // 뒤로가기
    public static void goBack(){
        if(!back.empty())               // 뒤로 갈 스택이 있다면, back 스택을 pop하여 forward에 저장, 즉 뒤로 이동
            forward.push(back.pop());
    }
}
