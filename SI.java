
// Calculate Simple Interest
import java.util.Scanner;
public class SI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount (P): ");
        float p = sc.nextFloat();
        System.out.print("Enter time period (T) in years: ");
        float t = sc.nextFloat();
        System.out.print("Enter rate of interest (R) in percentage: ");
        float r = sc.nextFloat();
        double si = (p * t * r) / 100;
        System.out.println("The Simple Interest is: " + si);
        sc.close();
    }
}