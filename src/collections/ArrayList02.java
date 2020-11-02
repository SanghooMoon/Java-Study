package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {
        final int LIMIT = 10;	// 자르고자 하는 글자의 개수를 지정한다.
        String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
        int length = source.length();   // 43

        List list = new ArrayList(length/LIMIT + 10); // 크기를 약간 여유 있게 잡는다. 부족하면 자동적으로 크기가 늘어나긴 하지만, 이 과정에서 시간이 많이 소요

        for(int i=0; i < length; i+=LIMIT) {
            if(i+LIMIT < length )
                list.add(source.substring(i, i+LIMIT)); // 0이상 10미만, 10이상 20미만, 20이상 30미만 ...
            else
                list.add(source.substring(i));
        }

        for(int i=0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
