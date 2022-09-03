package lesson8;

import java.util.Scanner;

import tools.Tool;

public class ATM1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 設定帳號密碼
        System.out.println("第一次登入請設定帳號跟密碼");
        System.out.println("請輸入帳號");
        String name = scanner.next();
        System.out.println("請輸入密碼");
        String password = scanner.next();

        ATM atm = new ATM(name, password);
        System.out.println("密碼設定完成。");

        atm.login(name, password);

        if (atm.isLogin()) {
            while (true) {
                System.out.println("(1)提錢 (2)存錢 (3)餘額 (4)離開");
                int choice = Tool.getNextInt(scanner);
                if (choice == 4) {
                    break;
                }
                if (choice == 1) {
                    System.out.println("請輸入提款金額:");
                    int amount = Tool.getNextInt(scanner);
                    atm.withdraw(amount);
                } else if (choice == 2) {
                    System.out.println("請輸入存款金額:");
                    int amount = Tool.getNextInt(scanner);
                    atm.deposit(amount);
                } else if (choice == 3) {
                    System.out.println(atm);
                } else {
                    System.out.println("選擇不正確!");
                }
            }
        }
        System.out.println("感謝使用!");
        scanner.close();
    }
}
