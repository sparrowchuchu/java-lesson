package lesson3;

public class CH3_5 {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        boolean x = false;
        // && ==> 短路模式 &&前為false,則&&後不會執行++
        // & ==> &前後都會執行
        if (a > b && ++c < b) {
            System.out.println(c);
        }
        System.out.println(c);

        if (a < b && !(b > c)) {
            System.out.println(c);
        }

        if (!x) {
            System.out.println(x);
        }
    }
}
