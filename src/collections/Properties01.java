package collections;

import java.util.*;

/**
 * Properties : Hashtable을 상속받아 구현, Hashtable은 키와 값을(Object, Object)의 형태지만 Properties는 (String, String)형태
 * 주로 애플리케이션의 환경설정과 관련된 속성을 저장하는데 사용되면 데이터를 파일로부터 읽고 쓰는 편리한 기능을 제공
 * 간단한 입출력은 Properties를 활용하면 쉬움
 */
public class Properties01 {
    public static void main(String[] args) {
        Properties prop = new Properties();

        // prop에 키와 값(key, value)을 저장한다.
        prop.setProperty("timeout","30");
        prop.setProperty("language","kr");
        prop.setProperty("size","10");
        prop.setProperty("capacity","10");

        // prop에 저장된 요소들을 Enumeration을 이용해서 출력한다.
        Enumeration e = prop.propertyNames();

        while(e.hasMoreElements()) {
            String element = (String)e.nextElement();
            System.out.println(element + "="+ prop.getProperty(element));
        }

        System.out.println();
        prop.setProperty("size","20");	// size의 값을 20으로 변경한다.
        System.out.println("size="       + prop.getProperty("size"));
        System.out.println("capacity="   + prop.getProperty("capacity", "20")); // key가 capacity의 value를 꺼냄, 없으면 "20" 출력
        System.out.println("loadfactor=" + prop.getProperty("loadfactor", "0.75"));

        System.out.println(prop);	// prop에 저장된 요소들을 출력한다.
        prop.list(System.out);      // prop에 저장된 요소들을 화면(System.out)에 출력한다.
    }
}
