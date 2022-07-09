package DM1047;

public class GauB {
    public static void main(String[] args) {
        int starting = 1;
        int ending = 100;
        int sum;

        sum = ((starting + ending) * (ending - starting + 1) / 2);
        System.out.println("1到100總和是: " + sum);
    }
}
