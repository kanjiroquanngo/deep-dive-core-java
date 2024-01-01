
package printingUsingSystem;
import java.lang.*;
import java.util.*;

public class CreateStringObjects {
    public static void main(String[] args) {
        String str1 = "Java Program";
        String str2 = new String("JAVA");
        
        char c[] = {'H','e','l','l','o'};
        String str3 = new String(c);
        
        byte b[] = {65, 66, 67, 68};
        String str4 = new String(b, 1, 2);
        
        String str5 = "JAVA";
        String str6 = "JAVA";
        
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5 == str6);
        
        
    }
}
