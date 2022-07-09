package lesson2;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入姓名: ");
        // next(無視空格),nextLine
        String name = input.nextLine();
        System.out.print("請輸入身高: ");
        double height = input.nextDouble();
        System.out.print("請輸入體重: ");
        double weight = input.nextDouble();

        double bmi = weight / Math.pow(height / 100, 2);

        System.out.printf("姓名:%s 身高:%.2f(cm) %.2f(kg) bmi:%.2f",
                name, height, weight, bmi);

        input.close();

    }
}
