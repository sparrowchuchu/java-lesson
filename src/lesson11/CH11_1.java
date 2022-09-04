package lesson11;

import java.io.File;

public class CH11_1 {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6 };
        File file = null;
        try {
            // file = open("test.txt");
            file.canWrite();
            file.canRead();
            // RuntimeException
            System.out.println(10 / 0);
            System.out.println(numbers[numbers.length]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);
            System.out.println("陣列超出範圍");
        } catch (ArithmeticException ex) {
            System.out.println(ex);
            System.out.println("除數不能為0");
        } finally {
            if (file != null) {
                // file.close();
            }
            System.out.println("到達finally...");
        }

        System.out.println("done!");
    }
}
