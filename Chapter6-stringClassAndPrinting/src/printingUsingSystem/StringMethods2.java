package printingUsingSystem;
import java.lang.*;
import java.util.*;

public class StringMethods2 {
    public static void main(String[] args) {
        String str1 = "Mr. Shahrukh Khan";
        
        System.out.println(str1.startsWith("Mr."));
        System.out.println(str1.startsWith("Shah", 4));
        System.out.println(str1.endsWith("Khan"));
        
        for (int i = 0; i < str1.length(); i++){
        System.out.println(str1.charAt(i));
        }
        String str2 = "www.udemy.co.in";
        System.out.println(str2.indexOf(".", 4));
        System.out.println(str2.lastIndexOf(".", 9));
        
    }
}
