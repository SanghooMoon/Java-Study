package collections;

// 아스키코드 순서대로 출력, 숫자 - 대문자 - 소문자 순
public class AsciiPrint {
    public static void main(String[] args) {
        char ch = ' ';
        for(int i=0; i < 95; i++)  // 공백(' ')이후의 문자들을 출력한다.
            System.out.print(ch++);
    }
}
