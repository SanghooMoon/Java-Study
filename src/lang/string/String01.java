package lang.string;

public class String01 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        System.out.println("str1 == str2 ? " + (str1 == str2));              // 문자열 리터럴로 선언하였기때문에 같은 주소를 보고있음(true)
        System.out.println("str1.equals(str2) ?  " + str1.equals(str2));     // 문자열의 내용을 비교하기때문에 true
        System.out.println();

        String str3 = new String("abc");
        String str4 = new String("abc");

        System.out.println("str3 = " + str3);
        System.out.println("str4 = " + str4);

        System.out.println("str3 == str4 ? " + (str3 == str4));             // 각각 new 연산자에 의해 다른 메모리 주소를 할당 받았기 때문에 false
        System.out.println("str3.equals(str4) ?  " + str3.equals(str4));    // 문자열의 내용을 비교하기때문에 true
    }
}
