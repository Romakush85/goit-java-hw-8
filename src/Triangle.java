import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(String name, double a, double b, double c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double getArea() {
        return Math.sqrt((getPerimeter() / 2) * ((getPerimeter() / 2) - a) * ((getPerimeter() / 2) - b) * ((getPerimeter() / 2) - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Triangle triangle = (Triangle) obj;
        double[] thisSides = {this.a, this.b, this.c};
        double[] objSides = {triangle.a, triangle.b, triangle.c};
        Arrays.sort(thisSides);
        Arrays.sort(objSides);
//        return Arrays.sort(thisSides);
        return Arrays.equals(thisSides, objSides);
    }
}
