package level4;

import java.util.Arrays;
import java.util.Scanner;

public class Q10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];


        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);
        System.out.println(array[0] + " " + array[N - 1]);

//        int min = array[0];
//        for (int i = 0; i < N; i++) {
//            if (min > array[i]) {
//                min = array[i];
//            }
//        }
//        int max = array[0];
//        for (int i = 0; i < N; i++) {
//            if (max < array[i]) {
//                max = array[i];
//            }
//        }
//
//        System.out.println(min + " " + max);
    }
}
