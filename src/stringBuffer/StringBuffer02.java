package stringBuffer;

public class StringBuffer02 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("01");
        StringBuffer sb2 = sb.append(23);
        sb.append('4').append(56);

        StringBuffer sb3 = sb.append(78);
        sb3.append(9.0);

        // 모두 같은 sb의 주소를 가리키고있기때문에 동일한 값 출력
        System.out.println("sb=" + sb);
        System.out.println("sb2=" + sb2);
        System.out.println("sb3=" + sb3);

        System.out.println("sb=" + sb.deleteCharAt(10));                        // 10번째 문자 삭제,          01234567890
        System.out.println("sb=" + sb.delete(3,6));                             // 3이상 6미만 자리 문자 삭제   01267890
        System.out.println("sb=" + sb.insert(3, "abc"));               // 3번째 위치에 문자열 추가     012abc67890
        System.out.println("sb=" + sb.replace(6, sb.length(), "END"));  // 6이상 11미만의 문자열 교체   012abcEND

        System.out.println("sb.reverse() = " + sb.reverse());                   // 문자열의 순서를 거꾸로 나열
    }
}
