public class ShapeUser {
    public static void main(String arg[]) {
        Shape shape[] = new Shape[3];//절대 Shape 객체 생성은 아니고 배열객체의 생성이다?
        shape[0] = new Circle(5); //Circle 객체를 shape[0] 배열에 할당
        shape[1] = new Circle(7); // Circle 객체를 shape[1] 배열에 할당
        shape[2] = new Rectangle(9, 5); // Ractangle 객체를 shape[2] 배열에 할당
        System.out.println("shape[0]'s area = " + shape[0].area()); //implemented method
        System.out.println("shape[1]'s area = " + shape[1].area());
        System.out.println("shape[2]'s area = " + shape[2].area());
    }
}
abstract class Shape {
    //anstract method 함수를 선언하세요.
    abstract double circumference();
    abstract double area();
}

class Circle extends Shape {
    protected int r;
    public Circle(int r) {
        this.r = r;
    }
    public double circumference() {
        return Math.PI*2*r;
    }
    public double area() {
        return Math.PI*r*r;
    }
}
class Rectangle extends Shape {
    protected int width, height;
    public Rectangle(int w, int h) {
        width = w;
        height = h;
    }
    public double circumference() {
        return 2*(width+height);
    }
    public double area() {
        return width*height;
    }
}