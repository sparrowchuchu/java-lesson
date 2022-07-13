package DM1047;

public class LoopLabel {
    public static void main(String[] args) {
        System.out.println("使用 loop label");
        outerloop: for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print("*");
                if (j >= i) {
                    System.out.println();
                    continue outerloop;
                }
            }
        }
        System.out.println("不使用 loop label");
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print("*");
                if (j >= i) {
                    System.out.println();
                    break;
                }
            }
        }
    }
}
