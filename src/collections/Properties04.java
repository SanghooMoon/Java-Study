package collections;

import java.util.Properties;

// 시스템 속성을 가져오는 예제
public class Properties04 {
    public static void main(String[] args) {
        Properties sysProp = System.getProperties();    // System 객체의 속성들을 가져옵니다.
        System.out.println("java.version :" + sysProp.getProperty("java.version"));
        System.out.println("user.languag :" + sysProp.getProperty("user.language"));
        sysProp.list(System.out);
    }
}
