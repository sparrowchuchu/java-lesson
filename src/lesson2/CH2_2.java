package lesson2;

public class CH2_2 {
    public static void main(String[] args) {
        float pi = 3.1415926f;
        int radius = 5;
        double area = radius * radius * pi;

        System.out.println("半徑為:" + radius);
        System.out.println("PI為:" + pi);
        System.out.println("面積為:" + area);
        System.out.println("圓周長:" + (radius * 2 * pi));
    }
}
