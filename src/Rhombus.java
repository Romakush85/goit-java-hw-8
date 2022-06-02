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

    public double getSide() {
        return Math.sqrt((diagonalA / 2) * (diagonalA / 2) + (diagonalB / 2) * (diagonalB / 2));
    }

    @Override
    public double getArea() {
        return (diagonalA * diagonalB) / 2;
    }

    @Override
    public double getPerimeter() {
        return 4 * getSide();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Rhombus rhombus = (Rhombus) obj;
        return (this.diagonalA == rhombus.diagonalA && this.diagonalB == rhombus.diagonalB) ||
                (this.diagonalA == rhombus.diagonalB && this.diagonalB == rhombus.diagonalA);
    }
}
