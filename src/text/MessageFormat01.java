package text;

import java.text.MessageFormat;

/**
 * 데이터를 정해진 양식에 맞게 출력할 수 있도록 출력할 수 있도록 도와준다.
 * 데이터가 들어갈 자리를 마련해 놓은 양식을 미리 작성하고 프로그램을 이용해서 다수의 데이터를 같은 양식으로 출력할 때 사용하면 좋다.
 */
public class MessageFormat01 {
    public static void main(String[] args) {
        String msg = "Name : {0} \nTel: {1} \nAng:{2} \nBirthday:{3}";

        Object[] arguments = {
                "이자바", "02-123-1234", "27", "07-09"
        };

        String result = MessageFormat.format(msg, arguments);
        System.out.println(result);
    }
}
