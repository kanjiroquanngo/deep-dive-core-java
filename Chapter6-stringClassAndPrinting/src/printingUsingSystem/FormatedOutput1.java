package printingUsingSystem;
import java.lang.*;
import java.util.*;
public class FormatedOutput1 {
    public static void main(String[] args) {
        int x = 10;
        float y = 12.56f;
        char c = 'A';
        String s = "Hello Java Formated Output!";
        System.out.printf("Hello %d %.3f %c %s World \n", x, y, c, s);
        System.out.printf("%3$s %1$d %2$.2f", x, y, s);
    }
}
