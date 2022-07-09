package lesson4;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        System.out.println("請輸入一個整數: ");
        // !scanner.hasNextInt() 檢查輸入是否為整數，
        // scanner.next() 接收不正確的輸入。
        while (!scanner.hasNextInt()) {
            System.out.println("輸入錯誤，請輸入一個整數。");
            scanner.next();
        }

        int x = scanner.nextInt();
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                // System.out.println(i);
                count++;
            }
            if (count > 2) {
                break;
            }
        }
        if (count == 2) {
            System.out.println(x + "是質數");
        } else {
            System.out.println(x + "不是質數");
        }
        scanner.close();
    }
}
