public class Rectangle {

    //Privata fields som inte är nåbara utanför klassen
    private double width;
    private double height;


    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }

    //Getter för width
    public double getWidth(){
        return width;
    }

    //Getter för height
    public double getHeight(){
        return height;
    }

    //Setter för height med logik
    public void setHeight(double height){
        if(height>0){
            this.height = height;
        }else{
            System.out.println("Ogiltigt värde: "+ height);
        }
    }

    //Setter för width med logik
    public void setWidth(double width){

        if(width>0){
            this.width = width;
        }else{
            System.out.println("Ogiltigt värde: " + width);
        }


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
