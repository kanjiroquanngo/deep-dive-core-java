import java.lang.*;
import java.util.*;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        double r1, r2;
        System.out.println("Enter values of a, b and c: ");
        a = Integer.parseInt(sc.nextLine());
        b = Integer.parseInt(sc.nextLine());
        c = Integer.parseInt(sc.nextLine());
        r1 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
        r2 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
        System.out.println("Roots are: " + r1 + " and " + r2);
    }
}
