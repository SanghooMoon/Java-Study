package collections;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        int[]	arr   =  {0,1,2,3,4};
        int[][] arr2D =  {{11,12,13}, {21,22,23}};

        System.out.println("arr="+Arrays.toString(arr));            // 1차원 배열의 요소를 출력
        System.out.println("arr2D="+Arrays.deepToString(arr2D));    // 2차원 배열도 가능

        int[] arr2 = Arrays.copyOf(arr, arr.length);        // arr 배열을 복사
        int[] arr3 = Arrays.copyOf(arr, 3);        // 길이가 3만큼 배열을 복사
        int[] arr4 = Arrays.copyOf(arr, 7);        // 길이가 7만큼 배열을 복사, 비어있는 값은 기본값
        int[] arr5 = Arrays.copyOfRange(arr, 2, 4); // arr 배열을 2이상 4미만 만큼 복사
        int[] arr6 = Arrays.copyOfRange(arr, 0, 7); // arr 배열을 0이상 7미만 만큼 복사

        System.out.println("arr2="+ Arrays.toString(arr2));
        System.out.println("arr3="+ Arrays.toString(arr3));
        System.out.println("arr4="+ Arrays.toString(arr4));
        System.out.println("arr5="+ Arrays.toString(arr5));
        System.out.println("arr6="+ Arrays.toString(arr6));

        int[] arr7 =  new int[5];
        Arrays.fill(arr7, 9);  // arr=[9,9,9,9,9]   / arr7 배열의 원소를 모두 9로 채움
        System.out.println("arr7="+Arrays.toString(arr7));

        Arrays.setAll(arr7, i -> (int)(Math.random()*6)+1);
        System.out.println("arr7="+Arrays.toString(arr7));

        for(int i : arr7) {
            char[] graph = new char[i];
            Arrays.fill(graph, '*');
            System.out.println(new String(graph)+i);
        }

        String[][] str2D  = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
        String[][] str2D2 = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};

        System.out.println(Arrays.equals(str2D, str2D2));      // false
        System.out.println(Arrays.deepEquals(str2D, str2D2));  // true

        char[] chArr = { 'A', 'D', 'C',  'B', 'E' };

        int idx = Arrays.binarySearch(chArr, 'B');
        System.out.println("chArr="+Arrays.toString(chArr));
        System.out.println("index of B ="+Arrays.binarySearch(chArr, 'B')); // 정렬을 하지 않아서 잘못된 결과
        System.out.println("= After sorting =");
        Arrays.sort(chArr); // 정렬
        System.out.println("chArr="+Arrays.toString(chArr));
        System.out.println("index of B ="+Arrays.binarySearch(chArr, 'B')); // 정렬 후라서 올바른 결과
    }
}
