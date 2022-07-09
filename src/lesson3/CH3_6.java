package lesson3;

import java.util.Scanner;

public class CH3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入國文: ");
        float ch = scanner.nextFloat();
        System.out.println("請輸入英文: ");
        float eng = scanner.nextFloat();
        System.out.println("請輸入數學: ");
        float math = scanner.nextFloat();

        // 使用邏輯運算子
        // 判斷國文跟數學其中一科60分以上且英文要大於60分才算合格
        boolean pass = (ch >= 60 || eng >= 60) && math >= 60;
        if (pass) {
            System.out.println("PASS!");
        } else {
            System.out.println("FAIL~");
        }

        // 三元運算子
        String PASS;
        PASS = (ch >= 60 || eng >= 60) && math >= 60 ? "恭喜通過!" : "留校察看~";
        System.out.println(PASS);

        scanner.close();
    }
}
