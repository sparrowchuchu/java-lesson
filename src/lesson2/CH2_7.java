package lesson2;

import java.util.Scanner;

public class CH2_7 {
    public static void main(String[] args) {
        // new Scanner物件
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入姓名: ");
        // next(無視空格),nextLine(保留空格)
        String name = input.nextLine();
        System.out.print("請輸入學號: ");
        int id = input.nextInt();
        System.out.print("請輸入分數: ");
        double score = input.nextDouble();

        System.out.println(name + "," + id + "," + score);
        System.out.printf("%s %d %.2f", name, id, score);

        input.close();
    }
}
