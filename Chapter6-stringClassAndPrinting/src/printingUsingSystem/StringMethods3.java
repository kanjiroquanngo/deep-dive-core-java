package printingUsingSystem;
import java.lang.*;
import java.util.*;
public class StringMethods3 {
    public static void main(String[] args) {
        String str1 = "Pyramid";
        String str2 = "pyramid";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1 == str2);
        
        String str3 = new String("Pyramid");
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
        
        System.out.println(str2.compareTo(str3));
        
        String str4 = "the great wall of china";
        System.out.println(str4.contains("wall"));
        
        String str5 = "the great wall ";
        String str6 = "of china";
        System.out.println(str5.concat(str6));
        
        String str7 = String.valueOf(7);
        System.out.println(str7);
        
    }
}
