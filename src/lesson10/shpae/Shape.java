package lesson10.shpae;

// 形狀抽象類別
public abstract class Shape {
    protected double width;
    protected double height;
    protected double area;

    // 抽象方法子類別必定要實作
    public abstract double getArea();
}
