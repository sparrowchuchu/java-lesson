package lesson4;

public class CH4_13_1 {
    public static void main(String[] args) {
        int i = 0, j = 0, k = 0;
        // boolean flag = false;

        Block1: {
            for (; i < 10; i++) {
                for (j = 0; j < 10; j++) {
                    for (k = 0; k < 10; k++) {
                        // System.out.printf("i=%d j=%d k=%d\n", i, j, k);
                        if (i == 5 && j == 5 && k == 5) {
                            // flag = true;
                            break Block1;
                        }
                    }
                }
            }
        }
        System.out.printf("i=%d j=%d k=%d", i, j, k);
    }
}
