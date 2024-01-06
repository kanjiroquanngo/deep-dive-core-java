package printingUsingSystem;
import java.lang.*;
import java.util.*;

public class StringMatchingWithRegularExpressions {
    public static void main(String[] args) {
        String str1 = "abc6def";
        System.out.println(str1.matches("[a-z]*"));
        String str2 = "abc def";
        System.out.println(str2.matches(".*"));
        String str3 = "abCdef";
        System.out.println(str3.matches("[a-z]*"));
        String str4 = "abcabcabcabc";
        System.out.println(str4.matches("[a-z]+"));
        String str5 = "";
        System.out.println(str5.matches("[a-z]+"));
        String str6 = "";
        System.out.println(str6.matches("[a-z]*"));
        String str7 = "acc";
        System.out.println(str7.matches("[a-z]{3}"));
        String str8 = "ac";
        System.out.println(str8.matches("[a-z]{3}"));
        String str9 = "acccbbca";
        System.out.println(str9.matches("[a-z]{3,7}"));
        String str10 = "john@gmail.com";
        System.out.println(str10.matches("\\w*@gmail(.*)"));
    }
}
