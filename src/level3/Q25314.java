package level3;

import java.util.Scanner;

public class Q25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n / 4;
        for (int j = 0; j < m; j++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
