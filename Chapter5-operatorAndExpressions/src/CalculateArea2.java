import java.lang.*;
import java.util.*;

public class CalculateArea2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        float s;
        double area;
        
        System.out.println("Enter 3 sides of a Triangle: ");
        a = Integer.parseInt(scanner.nextLine());
        b = Integer.parseInt(scanner.nextLine());
        c = Integer.parseInt(scanner.nextLine());
        
        s = (a+b+c)/2f;
        
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        
        System.out.println("Area is: " + area);
    }
}
