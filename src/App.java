public class App {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < args.length; i++) {
            // args 可接收外部傳入參數
            System.out.println(args);
            // System.out.println(args[0]);
            System.out.printf("Hello, %s!\n", args[i]);
        }

        System.out.println("Sharon");
        System.out.println("160");
        System.out.println("40");
        // 計算BMI BMI=體重(公斤)/身高2(公尺2)
        System.out.println("BMI:" + (40 / ((160.0 / 100) * (160.0 / 100))));
    }
}
