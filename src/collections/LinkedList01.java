package collections;

/**
 * 배열의 단점을 보완하기위해 LinkedList라는 자료구조가 고안.
 * 배열은 모든 데이터가 연속저긍로 존재하지만 링크드 리스트는 불연속적으로 존재하는 데이터를 서로 연결(link)한 형태로 구성
 * 링크드 리스트의 각 요소(node)들은 자신고 ㅏ연결된 다음 요소에 대한 참조(주소값)와 데이터로 구성
 *
 * 링크드리스트는 이동방향이 단방향, 그렇기에 다음 요소는 접근이 쉽지만, 이전 요소는 접근이 어려움
 * 이 점을 보완한 것이 더블 링크드 리스트(이중 연결리스트)
 * 더블 링크드 리스트는 링크드 리스트보다 각 요소에 대한 접근과 이동이 쉽기 때문에 링크드 리스트보다 더 많이 사용된다.
 *
 * LinkedList 역시 List 인터페이스를 구현했기 때문에 ArrayList와 내부구현방법만 다를뿐 제공하는 메서드의 종류와 기능은 거의 같음.
 */
public class LinkedList01 {
}