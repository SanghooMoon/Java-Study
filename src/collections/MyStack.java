package collections;


import java.util.EmptyStackException;
import java.util.Vector;

// Vector 클래스를 상속받아 구현
class MyStack extends Vector {

    // 객체(item)을 추가하는 메서드
    public Object push(Object item) {
        addElement(item);
        return item;
    }

    // 맨 위의 객체를 반환, 실제 스택에서 꺼냄
    public Object pop() {
        Object obj = peek();	 // Stack에 저장된 마지막 요소를 읽어온다.
        //   만일 Stack이 비어있으면 peek()메서드가 EmptyStackException을 발생시킨다.
        //   마지막 요소를 삭제한다. 배열의 index가 0 부터 시작하므로 1을 빼준다.
        removeElementAt(size() - 1);

        return obj;
    }

    // 맨 위에 객체를 반환, 실제 스택에서 꺼내지는 않음
    public Object peek() {
        int	len = size();

        if (len == 0)
            throw new EmptyStackException();
        // 마지막 요소를 반환한다. 배열의 index가 0 부터 시작하므로 1을 빼준다.
        return elementAt(len - 1);
    }

    // 스택이 비어있는지 확인하는 메서드
    public boolean empty() {
        return size() == 0;
    }

    // 객체를 찾아 그 위치를 반환하는 메서드
    public int search(Object o) {
        int i = lastIndexOf(o);	// 끝에서부터 객체를 찾는다.
        // 반환값은 저장된 위치(배열의 index)이다.
        if (i >= 0) { // 객체를 찾은 경우
            return size() - i; // Stack은 맨 위에 저장된 객체의 index를 1로 정의하기 때문에
            // 계산을 통해서 구한다.
        }

        return - 1;		// 해당 객체를 찾지 못하면 -1를 반환한다.
    }
}
