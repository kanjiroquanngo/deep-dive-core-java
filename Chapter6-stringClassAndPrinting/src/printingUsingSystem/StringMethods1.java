package printingUsingSystem;
import java.lang.*;
import java.util.*;

public class StringMethods1 {
    public static void main(String[] args) {
        String str = new String("netbeans");
        
        int len = str.length();
        System.out.println(len);
        
        String str2 = str.toUpperCase();
        System.out.println(str2);
        
        String str2_1 = str2.substring(1, 4);
        System.out.println(str2_1);
        
        String str2_2 = str2.replace('E', 'M');
        System.out.println(str2_2);
        
        String str3 = new String("        netbeans         ");
        System.out.println(str3);
        str3 = str3.trim();
        System.out.println(str3);
    }
}
