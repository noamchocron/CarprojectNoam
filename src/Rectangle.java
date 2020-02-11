public class Rectangle {
    private double Length;
    private double Width;

    public Rectangle(double length, double width) {
        this.Length = length;
        this.Width = width;
    }

    public double getLength() {
        return Length;
    }

    public void setLength(double Length) {
        Length = Length;
    }

    public double getWidth() {
        return Width;
    }

    public void setWidth(double Width) {
        Width = Width;
    }

    public double getArea(){
        return Length * Width;
    }

    public double getDiagonal(){
        double a = Length * Length;
        double b = Width * Width;
        return Math.sqrt(a+b);

    }
    public boolean isSquare(){
        if(Length == Width){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return "rectangle{" +
                "width=" + Width +
                ", length=" + Length + '/' +
                '}';

    }
}
