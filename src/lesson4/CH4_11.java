package lesson4;

public class CH4_11 {
    public static void main(String[] args) {
        int i;

        for (i = 0; i < 10; i++) {
            if (i == 5) {

                break;
            }
            System.out.println("for迴圈" + i);
        }

        i = 0;
        while (i < 10) {
            if (i == 5) {
                break;
            }
            System.out.println("while迴圈" + i);
            i++;
        }
    }
}
