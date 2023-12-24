import java.lang.*;
import java.util.*;

public class CalculateArea {
    public static void main(String[] args) {
        float base, height, area;
        System.out.println("Enter Base and Height: ");
        Scanner scanner = new Scanner(System.in);
        base = Float.parseFloat(scanner.nextLine());
        height = Float.parseFloat(scanner.nextLine());
        area = base * height / 2;
        System.out.println("Area of a Triangle is: " + area);
    }
}
