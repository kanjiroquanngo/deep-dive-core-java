package printingUsingSystem;
import java.util.*;
import java.lang.*;

public class printingUsingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        System.out.println("Sum of number " + x + " and number " + y + " is " + (x+y));
    }
}
