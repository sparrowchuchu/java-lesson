package lesson4;

import java.util.Scanner;

public class CH4_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入起始值,終止值(空白區隔): ");
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        if (start > end) {
            System.out.printf("起始值 %d 不能大於終止值 %d 。\n", start, end);
        } else {
            int totle = 0;
            for (int i = start; i <= end; i++) {
                if (i % 2 == 0) {
                    totle += 1;
                }
            }
            System.out.printf("%d ~ %d 的偶數總和為: %d ", start, end, totle);
        }

        scanner.close();

    }
}
