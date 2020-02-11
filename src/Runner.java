public class Runner {
    public static void main(String[] args) {
        Car myCar = new Car(
                2004, "Ferrari", 15000, "Enzo");

        System.out.println(myCar.toString());
        myCar.drive(1234);
        System.out.println(myCar.toString());


        Rectangle myRectangle = new Rectangle(10,10);
        System.out.println(myRectangle.toString());

        myRectangle.getArea();
        System.out.println(myRectangle.getArea());

        myRectangle.getDiagonal();
        System.out.println(myRectangle.getDiagonal());


    }
}
