// Find the Perimeter of a Rectangle
import java.util.*;
public class Rectangleperimeter  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt(); 
        int width = sc.nextInt();  
        int perimeter = 2 * (length + width);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        sc.close();
    }
}
