import java.lang.*;
import java.util.*;

public class MaskingAndSwapping {
    public static void main(String[] args) {
        int a = 10, b = 15;
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("a: " + a + ", b: "+ b);
        byte a1 = 9;
        byte b1 = 12;
        byte c;
        c = (byte)(a1<<4);
        c = (byte)(c | b1);
        System.out.println((c & 0b11110000) >> 4);
        System.out.println((c & 0b00001111));
        
    }
}
