package lesson9;

public class Zoo {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit("小兔", 3.5);

        rabbit.info();
        rabbit.run();
        rabbit.eat();
        rabbit.sleep();
    }
}
