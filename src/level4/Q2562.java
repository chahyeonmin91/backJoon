package level4;

import java.util.Scanner;

public class Q2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[9];
        int max = 0;
        int count = 0;

        for (int i = 0; i < 9; i++) {
            array[i] = sc.nextInt();
            if (array[i] > max) {
                max = array[i];
                count = i+1;
            }
        }

        System.out.println(max);
        System.out.println(count);
    }
}
