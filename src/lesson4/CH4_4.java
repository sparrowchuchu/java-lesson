package lesson4;

public class CH4_4 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // i為區域變數
        for (int i = 0; i < 10; i++) {
            System.out.println("i為區域變數!,i=" + i);
        }

        // i為全域變數
        int i = 0;
        for (; i < 10;) {
            // i++ 會變無窮迴圈
            ++i;
            System.out.printf("i為區域變數!,i=%d\n", i);
        }

        System.out.println("------------------------------------");

        // 0~100的偶數總和
        int totle = 0;
        for (int ii = 0; ii < 101; ii++) {
            if (ii % 2 == 0) {
                totle += ii;
            }

        }
        System.out.println("0~100的偶數總和為: " + totle);
    }
}
