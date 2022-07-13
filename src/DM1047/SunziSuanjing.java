package DM1047;

public class SunziSuanjing {
    public static void main(String[] args) {
        // 雞兔同籠
        // 籠裡有 35個頭 100隻腳。問:籠裡雞兔各幾隻?
        int chicken = 0;
        int rabbit;

        while (true) {
            rabbit = 35 - chicken;
            if ((chicken * 2) + (rabbit * 4) == 100) {
                System.out.printf("雞有=%2d,兔有=%2d隻%n", chicken, rabbit);
                break;
            }
            chicken += 1;
        }
    }
}
