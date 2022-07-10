package lesson5;

import java.util.Arrays;

public class CH5_1 {
    public static void main(String[] args) {
        int x = 10;
        float y = 10;

        int[] a = { 1, 2, 3, 4, 5 };
        int[] b = { 1, 2, 3, 4, 5 };
        int[] c = a;

        // 顯示記憶體位置
        System.out.println(a);
        // a與b記憶體位置不同,a與c記憶體位置相同
        System.out.println(a == b);
        System.out.println(a == c);
        // Arrays.equals() 比較陣列值(與排序)是否相等
        System.out.println(Arrays.equals(a, b));

        // x與y記憶體位置相同
        System.out.println(x == y);
    }
}
