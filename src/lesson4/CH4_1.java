package lesson4;

import java.util.Scanner;

public class CH4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入分數: ");
        int score = scanner.nextInt();
        String level;
        if (score == 100) {
            level = "A+";
        } else if (score >= 90) {
            level = "A";
        } else if (score >= 80) {
            level = "B";
        } else if (score >= 70) {
            level = "C";
        } else if (score >= 60) {
            level = "D";
        } else {
            level = "E";
        }
        System.out.printf("分數:%d 評等:%s", score, level);

        scanner.close();
    }
}
