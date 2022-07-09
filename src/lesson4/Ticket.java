package lesson4;

import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {
        int pay = 250;
        float discount = 0.85f;
        double discount2 = 0.8;

        Scanner scanner = new Scanner(System.in);

        System.out.println("加瓦電影院");
        System.out.println("全票一張250元");
        System.out.println("請選擇票種: (1)全票 (2)優待票 (3)敬老票 (4)早場票");

        int choice = scanner.nextInt();

        // 使用if
        if (choice == 1) {
            System.out.printf("你選擇(1)全票 票價為:%d元\n", pay);
        } else if (choice == 2) {
            System.out.printf("你選擇(2)優待票 票價為:%d元\n", (int) (pay * discount));
        } else if (choice == 3) {
            System.out.printf("你選擇(3)敬老票 票價為:%d元\n", (int) (pay * discount * discount2));
        } else if (choice == 4) {
            System.out.printf("你選擇(4)早場票 票價為:%d元\n", (int) (pay * discount * discount2));
        } else {
            System.out.println("輸入錯誤。\n請輸入數字 1 到 4 選擇票種。");
        }

        // 使用switch
        switch (choice) {
            case 1:
                System.out.printf("你選擇(1)全票 票價為:%d元\n", pay);
                break;
            case 2:
                System.out.printf("你選擇(2)優待票 票價為:%d元\n", (int) (pay * discount));
                break;
            case 3:
                System.out.printf("你選擇(3)敬老票 票價為:%d元\n", (int) (pay * discount * discount2));
                break;
            case 4:
                System.out.printf("你選擇(4)早場票 票價為:%d元\n", (int) (pay * discount * discount2));
                break;
            default:
                System.out.println("輸入錯誤。\n請輸入數字 1 到 4 選擇票種。");
        }

        scanner.close();

    }
}
