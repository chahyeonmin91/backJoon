package level2;

import java.util.Scanner;

public class Q2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int timer = sc.nextInt();

        hour = hour + timer / 60;
        minute = minute + timer % 60;
        if (minute >= 60) {
            hour++;
            minute = minute - 60;
        }

        if (hour < 24) {
            System.out.println(hour + " " + minute);
        } else {
            System.out.println((hour - 24) + " " + minute);
        }
    }
}
