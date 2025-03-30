package level4;

import java.util.Scanner;

public class Q10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int count =0;


        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (array[i] == m) {
                count++;
            }
        }
        System.out.println(count);
    }
}
