package lesson4;

public class CH4_12 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("for迴圈" + i);
        }
    }
}
