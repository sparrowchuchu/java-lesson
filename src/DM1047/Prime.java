package DM1047;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        boolean prime = true;
        int num;
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入大於1的整數做質數測試 : ");
        num = scanner.nextInt();
        if (num == 2) {
            System.out.printf("%d 是質數\n", num);
        } else {
            for (int i = 2; i < num; i++) {
                if ((num % i) == 0) {
                    System.out.printf("%d 不是質數\n", num);
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.printf("%d 是質數\n", num);
            }

        }
        scanner.close();
    }
}
