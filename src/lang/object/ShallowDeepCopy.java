package lang.object;
class Point2 {
    int x, y;

    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2{" + "x=" + x + ", y=" + y + '}';
    }
}
class Circle implements Cloneable{
    Point2 p;    // 원점
    double r;   // 반지름

    public Circle(Point2 p, double r) {
        this.p = p;
        this.r = r;
    }

    // 얕은 복사
    public Circle shallowCopy() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (Circle)obj;
    }

    // 깊은 복사
    public Circle deepCopy() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        Circle c = (Circle)obj;
        c.p = new Point2(this.p.x, this.p.y);
        return c;
    }

    @Override
    public String toString() {
        return "Circle{" + "p=" + p + ", r=" + r + '}';
    }
}

public class ShallowDeepCopy {
    public static void main(String[] args) {
        Circle c1 = new Circle(new Point2(1,1), 2.0);
        Circle c2 = c1.shallowCopy();
        Circle c3 = c1.deepCopy();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        c1.p.x = 9;
        c1.p.y = 9;

        System.out.println("= c1 변경 후 =");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
