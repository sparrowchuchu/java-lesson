package lesson9;

public class Rabbit {
    private String name;
    private double weight;

    public Rabbit(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public void sleep() {
        System.out.println("我很愛睡覺");
    }

    public void eat() {
        System.out.println("我喜歡吃草");
    }

    public void run() {
        System.out.println("我跑很快!");
    }

    public void info() {
        System.out.printf("%s 體重:%.2f\n", name, weight);
    }
}
