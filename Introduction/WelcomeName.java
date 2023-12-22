import java.util.*;
import java.lang.*;

public class WelcomeName {
    public static void main(String[] args) {
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("May I know your name?");
        name = scanner.nextLine();
        System.out.println("Welcome " + name + " to our World!");
    }
}