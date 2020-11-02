package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackAndQueue01 {
    public static void main(String[] args) {
        Stack st = new Stack();
        Queue q = new LinkedList();	 // Queue인터페이스의 구현체인 LinkedList를 사용

        st.push("0");
        st.push("1");
        st.push("2");

        q.offer("0");
        q.offer("1");
        q.offer("2");

        System.out.println("= Stack =");
        while(!st.empty()) {
            System.out.println(st.pop());   // 0 1 2 순서로 들어왔으니, 2 1 0 순서로 꺼냄
        }

        System.out.println("= Queue =");
        while(!q.isEmpty()) {
            System.out.println(q.poll());   // 0 1 2 순서로 들어왔으니, 0 1 2 순서로 꺼냄
        }
    }
}
