package lesson4;

import java.util.Scanner;

public class CH4_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        boolean exit = false;
        int count = 0;

        System.out.println("學生成績輸入系統");
        while (!exit) {
            System.out.println("請輸入成績: ");
            total += scanner.nextDouble();
            count++;

            System.out.println("是否離開(y/n)");
            // .toLowerCase()字母轉小寫

            // 三元運算式
            exit = scanner.next().toLowerCase().equals("y") ? true : false;

            // if判斷式
            // String input = scanner.next().toLowerCase();
            // if (input.equals("y")) {
            // exit = true;
            // }

        }
        System.out.printf("輸入成績次數: %d次。學生總成績為: %.0f分。\n", count, total);
        scanner.close();
    }
}
