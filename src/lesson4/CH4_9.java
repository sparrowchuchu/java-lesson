package lesson4;

public class CH4_9 {
    public static void main(String[] args) {
        int x = 50;
        int y = 20;
        int i;

        while (x > y) {
            System.out.println(x - y);
            x -= y;
        }

        i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }

        System.out.println("END");
    }
}
