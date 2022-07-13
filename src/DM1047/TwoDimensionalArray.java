package DM1047;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        // 配置二維陣列 (2row 3column)
        int[][] x = new int[2][3];
        System.out.println(">>配置二維陣列 (2row 3column)\n");

        // 宣告與定義二維陣列初值
        int[][] y = { { 1, 2, 3 }, { 4, 5, 6 } };
        System.out.println(">>宣告與定義二維陣列初值\n" + y + "\n");

        // 分層配置二維陣列空間
        System.out.println(">>分層配置二維陣列空間");
        int[][] z = new int[2][];
        for (int i = 0; i < z.length; i++) {
            z[i] = new int[3];
        }
        System.out.println("元素數量= " + z.length);
        for (int i = 0; i < z.length; i++) {
            System.out.printf("z[%d]元素數量= %d\n", i, x[i].length);
        }

        // 不同長度的二維陣列
        System.out.println("\n>>不同長度的二維陣列");
        int[][] d = new int[2][];
        d[0] = new int[3];
        d[1] = new int[2];
        System.out.println("元素數量= " + d.length);
        for (int i = 0; i < d.length; i++) {
            System.out.printf("d[%d]元素數量= %d\n", i, d[i].length);
        }
        d[0][0] = 1;
        d[0][1] = 2;
        d[0][2] = 3;
        d[1][0] = 4;
        d[1][1] = 5;
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                System.out.printf("d[%d][%d]= %d\t", i, j, d[i][j]);
            }
            System.out.println();
        }
    }
}
