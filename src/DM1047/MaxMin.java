package DM1047;

public class MaxMin {
    public static void main(String[] args) {
        int[] score = { 90, 95, 80, 79, 92 };
        int max, min;
        // 給 max,min 一個初始值
        max = min = score[0];
        for (int sc : score) {
            if (sc < min) {
                min = sc;
            }
            if (sc > max) {
                max = sc;
            }
        }
        System.out.println("Max= " + max);
        System.out.println("Min= " + min);
    }
}
