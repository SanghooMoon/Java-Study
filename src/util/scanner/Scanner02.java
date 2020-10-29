package util.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("data2.txt"));
        int cnt = 0;
        int totalSum = 0;

        while(sc.hasNextLine()){
            String line = sc.nextLine();
            Scanner sc2 = new Scanner(line).useDelimiter(",");
            int sum = 0;

            while(sc2.hasNextInt()){
                sum += sc2.nextInt();
            }
            System.out.println(line + ", sum = " + sum);
            totalSum += sum;
            cnt++;
        }
        System.out.println("Line : " + cnt + ", Total: " + totalSum);
        /*
            100,100,100, sum = 300
            200,200,200, sum = 600
            300,300,300, sum = 900
            400,400,500, sum = 1300
            500,500,500, sum = 1500
            Line : 5, Total: 4600
         */
    }
}
