package DM1047;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        int[] lottery = new int[50];
        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入要購買幾張大樂透: ");
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.printf("%d : \t", i);
            for (int n = 1; n <= 49; n++) {
                lottery[n] = n;
            }
            int counter = 1;
            while (counter <= 6) {
                int lotteryNum = (int) (Math.random() * (49 - 1 + 1)) + 1;
                if (lottery[lotteryNum] == 0) {
                    continue;
                } else {
                    System.out.printf("%d \t", lotteryNum);
                    lottery[lotteryNum] = 0;
                    counter++;
                }
            }
            System.out.println("\n");
        }
        scanner.close();
    }
}
