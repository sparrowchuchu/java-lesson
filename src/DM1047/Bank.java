package DM1047;

class TaipieBank {
    private String name;
    private int balance;
    private int rate = 30; // 匯率
    private double service_charge = 0.01; // 手續費率

    public TaipieBank(String name) {
        this.name = name;
        this.balance = 0;
    }

    public void saveMoney(int money) {
        this.balance += money;
    }

    public void withdrawMoney(int money) {
        this.balance -= money;
    }

    public double usa_to_taiwan(int usaD) { // 換匯計算
        if (this.balance >= 10000) {
            this.service_charge = 0.008;
        }
        return cal_rate(usaD);
    }

    private double cal_rate(int usaD) {
        double result;
        result = usaD * rate * (1 - service_charge); // 換匯結果
        return result;
    }

    public void get_balance() {
        System.out.println(name + "目前存款餘額" + balance);
    }
}

public class Bank {
    public static void main(String[] args) {
        TaipieBank A = new TaipieBank("Wang");
        int usdallor = 50;
        A.saveMoney(5000);
        System.out.println(usdallor + "可兌換"
                + A.usa_to_taiwan(usdallor) + "台幣");
        A.saveMoney(15000);
        System.out.println(usdallor + "可兌換"
                + A.usa_to_taiwan(usdallor) + "台幣");
    }
}
