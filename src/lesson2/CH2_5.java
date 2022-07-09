package lesson2;

public class CH2_5 {
    public static void main(String[] args) {
        // final 常數設定 ，常數的變數名稱習慣以大寫命名。
        final float PI = 3.1415926f;
        int radius = 5;
        double area = radius * radius * PI;

        System.out.printf("半徑為:%d PI為:%f 圓面積:%.2f圓周長:%.2f\n",
                radius, PI, area, radius * 2 * PI);

        System.out.println("半徑為:" + radius);
        System.out.println("PI為:" + PI);
        System.out.println("圓面積:" + area);
        System.out.println("圓周長:" + (radius * 2 * PI));
    }
}
