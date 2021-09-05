public class Main {

    public static void main(String[] args) {
	// write your code here
        Circle circle1 = new Circle(1);
        System.out.println(circle1.toString());
        circle1.printCircle();
        System.out.println(circle1.getArea() + " " + circle1.getPerimeter() );

        System.out.println();
        System.out.println();

        Rectangle rec1 = new Rectangle(2,2);
        System.out.println(rec1.toString());
        System.out.println(rec1.getHeight() + " " + rec1.getWidth());
        System.out.println(rec1.getPerimeter() + " " + rec1.getArea());




    }
}
