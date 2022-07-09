package lesson4;

public class CH4_8 {
    public static void main(String[] args) {
        int cost = 99999;
        double discont = .851256677;
        double total = cost * discont;
        System.out.println(total);
        System.out.printf("%.0f\n", total);
        System.out.printf("%.2f\n", total);
        // Math.round() 四捨五入,double
        // Math.ceil() 無條件進位,
        // Math.floor() 無條件捨去,
        System.out.println(Math.round(total));
        System.out.println(Math.ceil(total));
        System.out.println(Math.floor(total));

        // Long x = Math.round(total);

        System.out.println(Math.round((total * 10.0) / 10.0));
        System.out.println(Math.round((total * 100.0) / 100.0));
        System.out.println(Math.round((total * 1000.0) / 1000.0));

    }
}
