package practice4;

public class CircleTest {
    public static void main(String[] args){
        Circle c1 = new Circle(10);
        System.out.println("Радиус: " + c1.getRadius());
        System.out.println("Площадь окружности : " + c1.getSquare());
        System.out.println("Длина окружности : " + c1.getLength());
        c1.setRadius(15);
        System.out.println("Новый радиус : " + c1.getRadius());
        System.out.println("Новая площадь окружности : " + c1.getSquare());
        System.out.println("Новая длина окружности : " + c1.getLength());
    }
}
