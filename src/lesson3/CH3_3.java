package lesson3;

public class CH3_3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 0, c = 0;

        a += 5;// a=a+5

        System.out.println(a + 1);
        // 賦值運算 ++ or --
        // 前置與後置運算
        b = a++; // a=a+1
        c = ++a;

        System.out.printf("a=%d b=%d\n", a, b);
        System.out.printf("a=%d c=%d\n", a, c);
        // b c 會先相加賦值給 d 後 再分別遞增賦值給自己。
        int d = b++ + c++;
        System.out.println(d + "," + b + "," + c);

    }
}
