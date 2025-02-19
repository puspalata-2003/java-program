// Calculate Compound Interest
import java.util.*;
public class compoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount (P): ");
        float p = sc.nextFloat();
        System.out.print("Enter time period (T) in years: ");
        float t = sc.nextFloat();
        System.out.print("Enter rate of interest (R) in percentage: ");
        float r = sc.nextFloat();
        double ci = p * Math.pow(1 + (r / 100), t) - p;
        System.out.println("The Compound Interest is: " + ci);
        sc.close();
    }
}

