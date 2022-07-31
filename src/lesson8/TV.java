package lesson8;

public class TV {
    // 常數區
    final int MAX_CHANNEL = 120;
    final int MAX_VOLUME = 10;

    // 屬性區
    private int channel;
    private int volume;
    private boolean power;
    String brand;
    public String setBrand;
    private static int count;

    public TV() {
        channel = 1;
        volume = 1;
        brand = "Sony";
        count++;
    }

    public TV(int channel, int volume) {
        this(); // TV()
        turnOn();
        setChannel(channel);
        setVolume(volume);
    }

    public boolean getPower() {
        return power;
    }

    public void turnOn() {
        System.out.println("電視開機中...");
        power = true;
    }

    public void turnOff() {
        System.out.println("電視關機中...");
        power = false;
    }

    public boolean isOff() {
        if (!power) {
            System.out.println("電視未開機!");
            return true;
        }
        return false;
    }

    // 類別唯一的方法
    public static int getCounter() {
        return count;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setChannel(int channel) {
        if (!isOff() && channel > 0 && channel <= this.MAX_CHANNEL) {
            this.channel = channel;
        } else {
            System.out.println("輸入超出頻道範圍");
        }
    }

    public void channelUp() {
        if (!isOff() && this.channel < this.MAX_CHANNEL) {
            this.channel++;
        } else {
            System.out.println("已到頻道上限。");
        }
    }

    public void channelDown() {
        if (!isOff() && this.channel > 1) {
            this.channel--;
        } else {
            System.out.println("已到頻道下限。");
        }
    }

    public void setVolume(int volume) {
        if (!isOff() && volume > 1 && volume <= this.MAX_VOLUME) {
            this.volume = volume;
        } else {
            System.out.println("輸入超出音量範圍");
        }
    }

    public void volumeUp() {
        if (!isOff() && this.volume < this.MAX_VOLUME) {
            this.volume++;
        } else {
            System.out.println("已到音量上限。");
        }
    }

    public void volumeDown() {
        if (!isOff() && this.volume > 1) {
            this.volume--;
        } else {
            System.out.println("已到音量下限。");
        }
    }

    public String getInfo() {
        return String.format("%s 開關:%b 頻道:%d 音量:%d", brand, power, channel, volume);
    }
}
