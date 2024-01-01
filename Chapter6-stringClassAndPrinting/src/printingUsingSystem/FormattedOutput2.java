package printingUsingSystem;
import java.lang.*;
import java.util.*;

public class FormattedOutput2 {
    public static void main(String[] args) {
        int a = -10;
        System.out.printf("%05d \n", a);
        System.out.printf("%(5d \n", a);
        System.out.printf("%+5d \n", a);
        
        float b = 23.458323f;
        System.out.printf("%6.2f \n", b);
        
        String s = "Java";
        System.out.printf("%-20s \n", s);
        System.out.format("%20s \n", s);
    }
}
