package lesson4;

import java.util.Scanner;

public class CH4_3 {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入選項 1 或 2 : ");
        choice = input.nextInt();

        if (choice == 1) {
            System.out.println("你選擇了(1)");
        } else if (choice == 2) {
            System.out.println("你選擇了(2)");
        } else {
            System.out.println("輸入錯誤");
        }

        switch (choice) {
            case 1:
                System.out.println("你選擇了(1)");
                break;
            case 2:
                System.out.println("你選擇了(2)");
                break;
            default:
                System.out.println("輸入錯誤");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.printf("是否繼續?(y/n)");
        String choice1 = scanner.next();

        if (choice1.equals("y") || choice1.equals("Y")) {
            System.out.println("選擇繼續");
        }

        switch (choice1) {
            case "y":
            case "Y":
                System.out.println("選擇繼續");
                break;
            case "n":
            case "N":
                System.out.println("選擇結束");
                break;
        }

        input.close();
        scanner.close();
    }
}
