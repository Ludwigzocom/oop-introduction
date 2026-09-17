public class RectangleMain {


    static void main(String[] args) {

        Rectangle rectangle = new Rectangle(0.1, 23);

        rectangle.setWidth(-5);
        rectangle.describe();

//        rectangle.height = -12;
//        System.out.println(rectangle.height);


        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getHeight());
        rectangle.setWidth(20);

        System.out.println(rectangle.getWidth());


    }

}
