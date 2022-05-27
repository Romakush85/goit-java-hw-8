public class Rhombus extends Shape {
    private double diagonalA;
    private double diagonalB;

    public Rhombus(String name, double diagonalA, double diagonalB) {
        super(name);
        this.diagonalA = diagonalA;
        this.diagonalB = diagonalB;
    }

    public double getDiagonalA() {
        return diagonalA;
    }

    public void setDiagonalA(double diagonalA) {
        this.diagonalA = diagonalA;
    }

    public double getDiagonalB() {
        return diagonalB;
    }

    public void setDiagonalB(double diagonalB) {
        this.diagonalB = diagonalB;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
