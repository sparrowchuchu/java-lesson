package DM1047;

import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        int c;
        float f;
        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入攝氏溫度: ");
        c = scanner.nextInt();
        // 將9/5的值(int) 強制轉型為float
        f = c * (float) 9 / 5 + 32;

        System.out.printf("攝氏溫度:%d度C 華氏溫度是:%.2f度F", c, f);

        scanner.close();
    }
}
