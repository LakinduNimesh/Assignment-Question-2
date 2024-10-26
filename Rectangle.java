interface Shape{
    void getArea();
}
class Rectangle implements Shape{

    protected int height;
    protected int width;

    public Rectangle(int height,int width){
        this.height = height;
        this.width = width;
    }

    @Override
    public void getArea() {
        System.out.println(" Area of rectangle : " + (height * width));
    }


    public static void main(String[] args) {
        System.out.println();
        Rectangle rectangle = new Rectangle(25,75);
        rectangle.getArea();
        System.out.println();

        Square square = new Square(25);
        square.getArea();
    }


}

class Square implements Shape{
    private int axis;

    public Square(int axis){
        this.axis = axis;
    }

    @Override
    public void getArea() {
        System.out.println(" Area of rectangle : " + (axis * axis));
    }
}
