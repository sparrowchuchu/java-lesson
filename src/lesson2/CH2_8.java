package lesson2;

public class CH2_8 {
    public static void main(String[] args) {
        float x = 10.5f;
        double y = x;
        // 強制轉型
        float z = (float) y;

        System.out.println(x + "," + y + "," + z);

        System.out.println(40 / Math.pow((float) 165.0 / 100, 2));
        int a = (int) x;
        int b = (short) 32768;

        System.out.println(a + "," + b);

    }
}
