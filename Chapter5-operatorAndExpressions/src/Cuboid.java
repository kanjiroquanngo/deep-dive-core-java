import java.lang.*;
import java.util.*;

public class Cuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length, breath, height;
        int totalArea, volume;
        System.out.println("Enter length, breath and height: ");
        length = Integer.parseInt(sc.nextLine());
        breath = Integer.parseInt(sc.nextLine());
        height = Integer.parseInt(sc.nextLine());
        
        totalArea = 2*((length*breath)+(length*height)+(breath*height));
        volume = length * breath * height;
        
        System.out.println("Total area: " + totalArea);
        System.out.println("Volume: " + volume);
        
        
    }
}
