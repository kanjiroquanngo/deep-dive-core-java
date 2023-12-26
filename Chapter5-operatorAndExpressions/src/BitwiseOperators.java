import java.lang.*;
import java.util.*;

public class BitwiseOperators {
    public static void main(String[] args) {
//        int x = 10, y = 6, z;
//        z = x&y;
//        System.out.println(z);
//        int x = 0b1010;
//        int y = 0b0110;
//        int z;
//        z = x | y;
//        z = x ^ y;
//        int x = 0b1000;
//        int y;
//        y = x >> 1;
//        int x = - 0b1010;
//        int y;
//        y = x >>> 1;
//        System.out.println(y);
//        System.out.println(String.format("%s", Integer.toBinaryString(x)));
//        System.out.println(String.format("%s", Integer.toBinaryString(y)));
        int x = 10;
        int y;
        y = ~x;
        System.out.println(y);
        System.out.println(String.format("%s", Integer.toBinaryString(x)));
        System.out.println(String.format("%s", Integer.toBinaryString(y)));
    }
}
