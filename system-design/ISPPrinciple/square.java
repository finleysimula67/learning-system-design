package ISPPrinciple;

public class square implements TwoDimensionalShape {
    private final double side;

    public square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}
