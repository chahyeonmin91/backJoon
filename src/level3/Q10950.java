package level3;

import java.util.Scanner;

public class Q10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amount = sc.nextInt();
        int[] array = new int[amount];



        for (int i = 0; i < amount; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            array[i] = a + b;
        }

        for (int i : array) {
            System.out.println(i);
        }
    }
}
