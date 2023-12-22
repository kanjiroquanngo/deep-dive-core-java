import java.util.*;
import java.lang.*;

public class DataSizeRange {
    public static void main(String[] args) {
        System.out.println("Min int: " + Integer.MIN_VALUE);
        System.out.println("Max int: " + Integer.MAX_VALUE);
        System.out.println("Byte int: " + Integer.BYTES);
        System.out.println();

        System.out.println("Min float: " + Float.MIN_VALUE);
        System.out.println("Max float: " + Float.MAX_VALUE);
        System.out.println("Float bytes: " + Float.BYTES);
        System.out.println();
        
        System.out.println("Min byte: " + Byte.MIN_VALUE);
        System.out.println("Max byte: " + Byte.MAX_VALUE);
        System.out.println("Byte bytes: " + Byte.BYTES);
    }
}
