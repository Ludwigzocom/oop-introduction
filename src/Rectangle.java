public class Rectangle {

    double width;
    double height;


    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    public double calculateArea(){
        return width *height;
    }

    public double calculatePerimeter(){
        return 2* (width + height);
    }

    public boolean isSquare(){
        return width == height;
    }

    public void describe(){
        System.out.println("Rectangle: Height "+height+" || Width: "+width );
        System.out.println("Area : " +calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("Square? : "+ isSquare());

    }


}
