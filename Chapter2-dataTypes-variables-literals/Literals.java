import java.lang.*;
import java.util.*;

public class Literals {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 0b1010;
        byte b3 = 012;
        byte b4 = 0xA;
        
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        long l = 99999999999L;
        System.out.println(l);

        double d = 123.456d;
        float f = 12.7773f;
        System.out.println(d);
        System.out.println(f);

        long l2 = 999_999_999l;
        double d2 = 123_456.789d;
        System.out.println(l2);
        System.out.println(d2);
    }
}
