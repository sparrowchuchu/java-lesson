package lesson4;

import java.util.Random;
import java.util.Scanner;

//猜數字遊戲
//1.亂數(random)
//2.重複次數
//3.給予範圍(大於或小於)
public class GuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // rand會存在Heap(堆疊)區域。
        Random rand = new Random();
        int min = 1, max = 50;
        int number = rand.nextInt(max) + 1; // 取1~max的亂數。
        boolean flag = true;

        System.out.printf("請猜一個數字(%d~%d): \n", min, max);
        while (flag) {
            // 判斷輸入是否正確
            while (!scanner.hasNextInt()) {
                System.out.printf("輸入錯誤。請輸入數字(%d~%d)。\n", min, max);
                scanner.next();
            }

            int guess = scanner.nextInt();
            if (guess == number) {
                System.out.println("猜對了!");
                flag = false;
            } else if (number < guess) {
                max = guess;
                System.out.println("猜錯了。神秘數字比" + guess + "小。");
                System.out.printf("神秘數字在 %d 到 %d 之間。\n", min, max);
            } else {
                min = guess;
                System.out.println("猜錯了。神秘數字比" + guess + "大。");
                System.out.printf("神秘數字在 %d 到 %d 之間。\n", min, max);
            }
        }
        System.out.println("神秘數字是" + number + " ^^");
        scanner.close();
    }
}