package collections;

import java.util.*;

public class HashSet04 {
    public static void main(String args[]) {
        HashSet setA    = new HashSet();
        HashSet setB    = new HashSet();
        HashSet setHab = new HashSet();
        HashSet setKyo = new HashSet();
        HashSet setCha = new HashSet();

        setA.add("1");		setA.add("2");
        setA.add("3");		setA.add("4");
        setA.add("5");
        System.out.println("A = "+setA);

        setB.add("4");		setB.add("5");
        setB.add("6");		setB.add("7");
        setB.add("8");
        System.out.println("B = "+setB);

        Iterator it = setB.iterator();
        while(it.hasNext()) {
            Object tmp = it.next();
            if(setA.contains(tmp))  // 둘다 포함되있는 객체를 add, 즉 교집합
                setKyo.add(tmp);
        }

        it = setA.iterator();
        while(it.hasNext()) {
            Object tmp = it.next();
            if(!setB.contains(tmp)) // A 원소중에 B에 포함되지 않은것들 add, A - B 즉 차집합
                setCha.add(tmp);
        }

        it = setA.iterator();
        while(it.hasNext())
            setHab.add(it.next());  // A 모두 add

        it = setB.iterator();
        while(it.hasNext())         // B 모두 add
            setHab.add(it.next());

        System.out.println("A ∩ B = "+setKyo);  // 한글 ㄷ을 누르고 한자키
        System.out.println("A ∪ B = "+setHab);  // 한글 ㄷ을 누르고 한자키
        System.out.println("A - B = "+setCha);
    }
}
