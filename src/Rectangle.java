public class Rectangle extends GeometricObject{
    private double height;
    private double width;

    public Rectangle(){

    }

    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    public Rectangle(double height, double width, boolean filled, String color){
        this.height = height;
        this.width = width;
        setColor(color);
        setFilled(filled);
    }

    public double getHeight(){
        return height;
    }

    public double getWidth(){
        return width;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return 2*(width+height);
    }

}
