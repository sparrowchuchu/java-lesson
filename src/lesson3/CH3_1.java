package lesson3;

public class CH3_1 {
    public static void main(String[] args) {
        int a = 11;
        int b = 4;
        int c = 15;
        // 整數除法只會取得商
        System.out.println(a / b);
        System.out.println((float) a / b);
        System.out.println(c * (float) a / b);
        System.out.println(a % b);

        System.out.println(c % 3 == 0 && c % 5 == 0);

    }
}
