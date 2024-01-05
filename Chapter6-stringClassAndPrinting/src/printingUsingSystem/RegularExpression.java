package printingUsingSystem;
import java.lang.*;
import java.util.*;
public class RegularExpression {
    public static void main(String[] args) {
        String str1 = "a";
        System.out.println(str1.matches(".")); 
        String str2 = "%";
        System.out.println(str2.matches("."));
        String str2_1 = "ab";
        System.out.println(str2_1.matches("."));
        String str3 = "a";
        System.out.println(str3.matches("[^abc]")); 
        String str4 = "ab";
        System.out.println(str4.matches("[^abc]")); 
        String str5 = "p";
        System.out.println(str5.matches("[^abc]"));
        String str6 = "p";
        System.out.println(str6.matches("[a-z0-9]"));
        String str7 = "%";
        System.out.println(str7.matches("[a-z0-9]"));
        String str8 = "A";
        System.out.println(str8.matches("[a-zA-Z0-9]")); 
        String str9 = "a";
        System.out.println(str9.matches("[a-z][0-9]")); 
        String str10 = "a8";
        System.out.println(str10.matches("[a-z][0-9]")); 
        String str11 = "k";
        System.out.println(str11.matches("a|b"));
        String str12 = "c";
        System.out.println(str12.matches("abc")); 
        String str13 = "abc";
        System.out.println(str13.matches("abc")); 
        String str14 = "a";
        System.out.println(str14.matches("\\w"));
        String str15 = "5";
        System.out.println(str15.matches("\\d"));
        String str16 = "d";
        System.out.println(str16.matches("\\d"));
        String str17 = "$";
        System.out.println(str16.matches("\\s"));
        String str18 = "$";
        System.out.println(str16.matches("\\S"));
    }
}
