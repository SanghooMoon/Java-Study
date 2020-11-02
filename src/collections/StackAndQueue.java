package collections;

public class StackAndQueue {
    /**
     * 스택(Stack) : 마지막에 저장한 데이터를 가장 먼저 꺼내게 되는 LIFO(Last In First Out) 구조
     * 큐(Queue) : 처음에 저장한 데이터를 가장 먼저 꺼내게 되는 FIFO(First in First Out) 구조
     *
     * 스택은 순차적으로 데이터를 추가하고 삭제하기 때문에 ArrayList와 같은 배열기반의 컬렉션 클래스가 적합
     * 큐는 데이터를 꺼낼 때 항상 첫 번쨰 저장된 데이터를 삭제하므로 ArrayList 같은 배열기반 컬렉션을 사용하면 데이터를 꺼낼 때 마다 빈 공간을 채우기 위해 데이터의 복사가 발생
     * 하여 비효율, 그래서 큐는 ArrayList보다 추가/삭제가 쉬운 LinkedList로 구현하는 것이 더 적합
     *
     * Stack 메서드
     * boolean empty() : stack이 비어있는지 알려줌
     * Object peek() : stack의 맨 위에 저장된 객체를 반환, pop() 과 달리 실제 stack에서 꺼내지는 않음
     * Object pop() : stack의 맨 위에 저장된 객체를 꺼냄
     * Object push(Object item) : stack에 객체(item)를 저장
     * int result(Obejct o) : Stack에서 주어긴 객체(o)를 찾아 그 위치를 반환, 못찾으면 -1을 반환, 배열과 달리 위치는 0이 아닌 1부터 시작
     *
     * Queue 메서드
     * boolean add(Object o) : 지정된 객체를 Queue에 추가
     * Object remove() : Queue에서 객체를 꺼내 반환, 비어있으면 예외 발생
     * Object element() : 삭제없이 요소를 읽어온다. peek()과 달리 Queue가 비었을 때 예외 발생
     * boolean offer(Obejct o) : Queue에 객체를 저장, 성공하면 true, 실패하면 false
     * Object poll() : Queue에 객체를 꺼내서 반환, 비어있으면 null 반환
     * Object peek() : 삭제없이 요소를 읽어옴, 비어있으면 null을 반환
    */
}
