public class Main {


    public static void main(String[] args) {


        Dog dog1 = new Dog("Billy", 5);
        Dog dog2 = new Dog("Klasse", 12);
        Dog fiskpinne = new Dog("fisken", 12);
        Dog dog3 = dog1;

        dog3.name = "Jumbo";
        System.out.println(dog1);
        System.out.println(dog3);
        System.out.println(dog1.name + " || " + dog1.age);
        System.out.println(dog2.name + " || " + dog2.age);




        Rectangle rectangle1 = new Rectangle(12,32);
        Rectangle rectangle2 = new Rectangle(32,32);

        rectangle1.describe();
        rectangle2.describe();

        System.out.println(rectangle1.calculateArea());


        Rectangle[] rectangles = new Rectangle[3];

        rectangles[0] = new Rectangle(4.2, 10);
        rectangles[1] = new Rectangle(13.2,14.2);
        rectangles[2] = new Rectangle(52.3, 43.1);




        for (int i = 0; i < rectangles.length; i++) {
            System.out.println("Rectangle " + i + " area: " + rectangles[i].calculateArea());

        }

        int count = 1;
        for (Rectangle rectangle : rectangles){


            System.out.println("Rectangle" + count + "area: " + rectangle.calculateArea());
            count++;
        }



    }


}
