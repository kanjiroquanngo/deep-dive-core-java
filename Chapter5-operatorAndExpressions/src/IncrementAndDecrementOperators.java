import java.lang.*;
import java.util.*;
public class IncrementAndDecrementOperators {
    public static void main(String[] args) {
        int x = 5, y=4, z;
        z = 2*x++ + 3 * ++y;
        System.out.println(x + "," + y + "," + z);
        
        float a = 3.1f;
        a++;
        System.out.println(a);
        
        char b = 'B';
        b++;
        System.out.println(b);
    }
}
