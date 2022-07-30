package lesson8;

public class TV {
    // 常數區
    final int MAX_CHANNEL = 120;
    final int MAX_VOLUME = 10;

    // 屬性區
    int channel;
    int volume;
    boolean power;
    String brand;

    public TV() {
        this.channel = 1;
        this.volume = 1;
        this.brand = "Sony";
    }

    public TV(int channel, int volume) {
        this(); // TV()
        turnOn();
        setChannel(channel);
        setVolume(volume);
    }

    public void turnOn() {
        System.out.println("電視開機中");
        this.power = true;
    }

    public void turnOff() {
        System.out.println("電視關機中");
        this.power = false;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setChannel(int channel) {
        if (power && channel > 0 && channel <= this.MAX_CHANNEL) {
            this.channel = channel;
        } else {
            System.out.println("輸入超出頻道範圍");
        }
    }

    public void channelUp() {
        if (power && this.channel < this.MAX_CHANNEL) {
            this.channel++;
        } else {
            System.out.println("已到頻道上限。");
        }
    }

    public void channelDown() {
        if (power && this.channel > 1) {
            this.channel--;
        } else {
            System.out.println("已到頻道下限。");
        }
    }

    public void setVolume(int volume) {
        if (power && volume > 1 && volume <= this.MAX_VOLUME) {
            this.volume = volume;
        } else {
            System.out.println("輸入超出音量範圍");
        }
    }

    public void volumeUp() {
        if (power && this.volume < this.MAX_VOLUME) {
            this.volume++;
        } else {
            System.out.println("已到音量上限。");
        }
    }

    public void volumeDown() {
        if (power && this.volume > 1) {
            this.volume--;
        } else {
            System.out.println("已到音量下限。");
        }
    }

    public String getInfo() {
        return String.format("%s 開關:%b 頻道:%d 音量:%d", brand, power, channel, volume);
    }
}
