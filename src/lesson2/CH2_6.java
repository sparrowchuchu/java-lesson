package lesson2;

public class CH2_6 {
    public static void main(String[] args) {
        float rate = 0.02f;
        int money = 5000;
        float interest = 50000 * rate;
        double amount = money + interest;
        String name = "張三";

        // 格式化字元 +(加入正號) 0(數值有空位時補0) ,(數值加上千位分隔) -(輸出靠左)
        System.out.printf("存款人:%-5s 存款金額:%+8d 年利率:%3.2f%% " +
                "年利息:%.2f 本利和:%,.2f%n", name, money, rate, interest, amount);

        System.out.print("計算結束");
    }
}
