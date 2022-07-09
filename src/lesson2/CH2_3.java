package lesson2;

public class CH2_3 {
    public static void main(String[] args) {
        // 字串"" 字元''
        char a = 'A'; // 65
        char b = 1;
        // ascii
        char c = 97; // 'a'

        char d = '\n'; // 換行

        System.out.println(a);
        System.out.print(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(a + c);
        System.out.println(a + 5);
        System.out.println((int) a);
        System.out.println(65 == a);

        System.out.print("abc\ndef\nghi\n");
        System.out.println("end");
        System.out.println("123\t456\t789");
        System.out.println("HELLO \"JAVA\"");
        System.out.println("HELLO 'JAVA'");
    }
}
