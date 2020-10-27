package lang.object;

/**
 * clone() : 자신을 복제하여 새로운 인스턴스를 생성하는 일
 * Object 클래스에 정의된 clone은 단순히 인스턴스 변수의 값만을 복사하기때문에 참조타입의 인스턴스 변수가 있는 클래스는 완전한 복제가 안됌
 * ex) 배열(Array) 경우 복제된 인스턴스도 같은 배열의 주소를갖기 떄문에 복제된 인스턴스의 작업이 원래 인스턴스에 영향을 미침
 *     이런 경우 clone 메서드를 오버라이딩 해서 새로운 배열을 생성하고 배열의 내용을 복사하도록 해야함
 */
class Point implements Cloneable {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
    // clone() 오버라이드(재정의)
    @Override
    public Point clone() { // 공변 반환타입 : 실제로 반환되는 자손 객체의 타입으로 반환하여 번거로운 형변환 줄이기
        Object obj = null;
        try {
            obj = super.clone();    // clone() 은 반드시 예외처리 해줘야함
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (Point)obj;
    }
}

public class Clone01 {

    public static void main(String[] args) {
        Point origin = new Point(3,5);
        Point copy = origin.clone();

        System.out.println(origin);
        System.out.println(copy);

        System.out.println(origin == copy); // 내용은 복사되었지만 서로 다른 객체, false

    }
}
