package util.objects;

import java.util.Comparator;
import java.util.Objects;

import static java.util.Objects.*;

/**
 * Object 클래스에는 두 객체의 등가비교를 위한 equals()만 있고, 대소비교를 위한 compare()가 없다.
 * 그래서인지 Objects에서는 compare() 가 추가되었다.
 * compare()는 두 비교대상이 같으면 0, 크면 양수, 작으면 음수를 반환한다.
 *
 * Objects.equals()는 null검사를 하지 않아도 된다는 장점이 있다.
 * Objects.toString()도 위와 마찬가지로 내부적으로 null 검사를 한다는 것 빼고 특별한 것이 없다.
 *
 * deepEquals()는 객체를 재귀적으로 비교하기 때문에 다차원 배열의 비교도 가능
 */
public class Objects02 {
    public static void main(String[] args) {
        String[][] str2D = new String[][]{{"aaa", "bbb"}, {"AAA","BBB"}};
        String[][] str2D_2 = new String[][]{{"aaa", "bbb"}, {"AAA","BBB"}};

        // static import를 해도 Object 클래스와 이름이 같으면 충돌이 나서 이름을 붙여줘야한다.
        System.out.println("Objects.equals(str2D, str2D_2)="+Objects.equals(str2D, str2D_2));           // false
        System.out.println("deepEquals(str2D, str2D_2)="+ deepEquals(str2D, str2D_2));   // true

        System.out.println("isNull(null)="+ isNull(null));    // true
        System.out.println("nonNull(null)="+ nonNull(null));  // false
        System.out.println("Objects.hashCode(null)=" + Objects.hashCode(null)); // 0 (null 이면 0반환)
        System.out.println("Objects.toString(null)=" + Objects.toString(null)); // null
        System.out.println("Objects.toString(null, str)=" + Objects.toString(null, "nullDefault")); // nullDefault

        Comparator c = String.CASE_INSENSITIVE_ORDER; // 대소문자 구분 안하는 비교
        System.out.println(compare("aa", "bb", c)); // -1 대소문자 구분없이 aa가 bb보다 작기떄문에 음수
        System.out.println(compare("bb", "aa", c)); // 1  대소문자 구분없이 bb가 aa보다 크기때문에 양수
        System.out.println(compare("ab", "AB", c)); // -1 대소문자 구분없이 ab가 AB와 같기때문에 0

    }
}
