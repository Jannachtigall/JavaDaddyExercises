package mentorship.roadmap.Java_Core.step4_OOP.topic7_Shapes;

public class ShapeDemo {

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println("Площадь круга = " + circle.getArea() + ", длина окружности = " + circle.getPerimeter());
        System.out.println("Площадь прямоугольника = " + rectangle.getArea() + ", периметр = " + rectangle.getPerimeter());
    }
}
