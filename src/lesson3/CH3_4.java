package lesson3;

import java.util.Scanner;

public class CH3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入兩個整數數字(空白區隔): ");

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        // System.out.println(x+","+y);
        boolean z = x > y;

        if (z) {
            System.out.printf("x=%d y=%d 數字x比較大", x, y);
        } else {
            System.out.printf("x=%d y=%d 數字x比較小", x, y);
        }

        scanner.close();
    }
}
