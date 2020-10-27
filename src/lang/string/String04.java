package lang.string;

import java.util.StringJoiner;

/**
 *  join()과 StringJoiner
 *  여러 문자열 사이에 구분자를 넣어서 결합한다.
 */
public class String04 {
    public static void main(String[] args) {
        String animals = "dog,cat,bear";
        String[] arr = animals.split(",");

        System.out.println(String.join("-", arr));  // dog-cat-bear

        StringJoiner sj = new StringJoiner("/", "[", "]");  // 구분자, prefix, suffix
        for(String s : arr){
            sj.add(s);
        }
        System.out.println(sj.toString());  // [dog/cat/bear]

    }
}
