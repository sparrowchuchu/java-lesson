package lesson2;

public class CH2_4 {
    public static void main(String[] args) {
        char x = 'A';
        int y = 65;
        // 基本型態: == 比對值是否相等
        System.out.println(x == 65);
        System.out.println(y == 65);

        // 物件: == 比對記憶體位置是否相等
        // 物件: .equals() 比對值是否相等
        String name = "Sharon"; // 在字串池新增字串
        String name2 = "Sharon";
        String name3 = new String("Sharon"); // new在字串池
        System.out.println(name + "," + name2 + "," + name3);
        System.out.println(name == name2);
        System.out.println(name.equals(name2));
        System.out.println(name == name3);

        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

    }
}
