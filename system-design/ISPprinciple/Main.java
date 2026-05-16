package ISPprinciple;

public class Main {
    public static void main(String[] args) {
        TwoDimensionalShape mySquare = new square(5);
        System.out.println("Square Area: " + mySquare.area());

        ThreeDimensionalShape myCube = new Cube(3);
        System.out.println("Cube Surface Area: " + myCube.area());
        System.out.println("Cube Volume: " + myCube.volume());
    }
}
