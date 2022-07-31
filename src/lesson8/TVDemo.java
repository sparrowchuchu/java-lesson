package lesson8;

public class TVDemo {
    public static void main(String[] args) {
        TV tv1 = new TV();
        TV tv2 = new TV();
        TV tv3 = new TV();

        System.out.println(tv1);
        System.out.println(tv1.getPower());
        tv1.turnOn();
        System.out.println(tv1.getPower());

        System.out.println("=tv1=  " + tv1.getInfo());
        tv1.channelDown();
        tv1.volumeDown();
        System.out.println("=tv1=  " + tv1.getInfo());
        tv1.channelUp();
        tv1.volumeUp();
        System.out.println("=tv1=  " + tv1.getInfo());
        tv1.setChannel(113);
        tv1.setVolume(5);
        System.out.println("=tv1=  " + tv1.getInfo());

        System.out.println("=tv2=  " + tv2.getInfo());
        tv2.channelDown();
        tv2.volumeDown();
        System.out.println("=tv2=  " + tv2.getInfo());
        tv2.channelUp();
        tv2.volumeUp();
        System.out.println("=tv2=  " + tv2.getInfo());
        tv2.setChannel(57);
        tv2.setVolume(30);
        System.out.println("=tv2=  " + tv2.getInfo());

        tv3.setBrand("CHIMEI");
        System.out.println("=tv3=  " + tv3.getInfo());
        tv3.setChannel(2);
        tv3.setVolume(15);
        System.out.println("=tv3=  " + tv3.getInfo());
    }
}
