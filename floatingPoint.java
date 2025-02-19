 // Multiply Two Floating-Point Numbers
import java.util.*;
public class floatingPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble(); 
        double result = num1 * num2;
        System.out.println("The result of multiplying " + num1 + " and " + num2 + " is: " + result);
    }
}