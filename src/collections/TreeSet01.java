package collections;

import java.util.TreeSet;

public class TreeSet01 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        String from = "b";
        String to	= "d";

        set.add("abc");
        set.add("alien");
        set.add("bat");
        set.add("car");
        set.add("Car");
        set.add("disc");
        set.add("dance");
        set.add("dZZZZ");
        set.add("dzzzz");
        set.add("elephant");
        set.add("elevator");
        set.add("fan");
        set.add("flower");

        System.out.println(set);
        System.out.println("range search : from " + from  +" to "+ to);
        System.out.println("result1 : " + set.subSet(from, to));    // 범위 검색, from ~ to (to는 포함안됨)
        System.out.println("result2 : " + set.subSet(from, to + "zzz"));
    }
}
