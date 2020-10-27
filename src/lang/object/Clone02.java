package lang.object;

import java.util.Arrays;

public class Clone02 {
    public static void main(String[] args) throws CloneNotSupportedException {
        int[] arr = {1,2,3,4,5};
        int[] arrClone = arr.clone();
        arrClone[0] = 6;

        System.out.println(Arrays.toString(arr));       // 1,2,3,4,5
        System.out.println(Arrays.toString(arrClone));  // 6,2,3,4,5
    }
}
