package util.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("data.txt"));
        int sum = 0;
        int cnt = 0;

        while(sc.hasNext()){
            sum += sc.nextInt();
            cnt++;
        }
        System.out.println("sum=" + sum);
        System.out.println("average=" + (double)sum/cnt);
    }
}
