package lesson5;

import java.util.Arrays;

public class CH5_2 {
    public static void main(String[] args) {
        // 宣告int陣列大小為5 (靜態)，初始值為0。
        int[] x = new int[5];

        int[] y = { 0, 0, 0, 0, 0 };

        System.out.println(x);
        System.out.println(x.length);
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[3]);
        System.out.println(x[x.length - 1]);

        System.out.println(x == y);
        System.out.println(Arrays.equals(x, y));

        // 陣列賦值
        x[0] = 100;
        x[x.length - 1] = 99;

        for (int i = 0; i < x.length; i++) {
            System.out.println("用for迴圈輸出 " + x[i]);
        }
    }
}
