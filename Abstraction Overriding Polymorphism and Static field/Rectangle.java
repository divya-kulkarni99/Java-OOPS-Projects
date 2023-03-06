public class Rectangle extends Shape {
    public int dimension1,dimension2;
    public static String color = "Yellow";
    public Rectangle(int dim1, int dim2){

        this.dimension1 =dim1;
        this.dimension2 =dim2;
    }
    public Rectangle(String color) {

    }
    //Methods from Shape overridden
    @Override
    public double calculateArea() {

        return dimension1*dimension2;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(dimension1+dimension2);
    }

    public static void Color(){
        System.out.println("Color of Rectangle is "+Rectangle.color);
    }

}
