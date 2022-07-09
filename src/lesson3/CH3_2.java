package lesson3;

import java.util.Scanner;

public class CH3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入秒數: ");
        long second = input.nextLong();
        int min = 0, hour = 0, day = 0;

        min = (int) (second / 60);
        hour = min / 60;
        day = hour / 24;
        int leftSec = (int) (second % 60);
        min = min % 60;

        System.out.printf("%d秒是 %d天%d小時%d分鐘%d秒",
                second, day, hour, min, leftSec);

        input.close();
    }
}
