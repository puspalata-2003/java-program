// Swap Two Numbers 
import java.util.*;
public class swapNumber  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Before swapping: num1 = " + a + ", num2 = " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("After swapping: num1 = " + a + ", num2 = " + b);
    }
}