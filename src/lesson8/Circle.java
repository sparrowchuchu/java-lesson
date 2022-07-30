package lesson8;

public class Circle {
    // 成員屬性區
    private double radius;

    // 成員方法區
    // 層級 package == default
    // 建構式 == class name
    public Circle() {
        this.radius = 0.5;
    }

    // 建構式 多載(overload)
    Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }

    public double getRadius() {
        return this.radius;
    }

    void setRadius(double radius) {
        if (radius > 0 && radius <= 1000) {
            this.radius = radius;
        } else {
            System.out.println("半徑設定錯誤 (>0 && <=1000)");
        }

    }
}
