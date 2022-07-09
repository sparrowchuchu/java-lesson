package lesson4;

//九九乘法表
public class CH4_7 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d x %d = %d   ", i, j, i * j);
                count++;
            }
            System.out.println();
        }
        System.out.println("總共跑動" + count + "次。");
    }
}
