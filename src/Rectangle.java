public class Rectangle extends Shape{
    int width;
    int height;

    Rectangle(int width, int height, String color){
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    void getArea() {
        int area = width * height;
        System.out.println("The area of the rectangle is = " + area);
    }
}
