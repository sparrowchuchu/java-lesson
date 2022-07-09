package lesson4;

import java.util.Scanner;

public class CH4_10_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        boolean exit = false;
        int count = 0;

        System.out.println("學生成績輸入系統");
        while (!exit) {
            System.out.printf("請輸入第%d位成績: ", count + 1);
            total += scanner.nextDouble();
            System.out.println("是否離開(y/n)");
            // 用scanner.nextLine()吃換行字元
            scanner.nextLine();
            exit = scanner.nextLine().toLowerCase().equals("y") ? true : false;
            count++;
        }
        System.out.printf("共%d位同學。總成績為: %.5f分，平均分為:%.2f。\n", count, total, total / count);
        scanner.close();
    }
}
