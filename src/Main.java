import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        PrinterUtil printer = new PrinterUtil();

        Triangle tr1 = new Triangle("Tr1", 3, 5, 4);
        Triangle tr2 = new Triangle("Tr2", 4, 5, 3);
        System.out.println(tr1.equals(tr2));
        System.out.println(printer.printName(tr1));


        Rhombus rhomb1 = new Rhombus("Rhomb1", 6, 8);
        Rhombus rhomb2 = new Rhombus("Rhomb2", 6, 10);
        System.out.println(rhomb1.getArea());
        System.out.println(rhomb2.getSide());
        System.out.println(rhomb1.equals(rhomb2));

    }
}