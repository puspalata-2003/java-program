 // Java Program to Check if a Number is a Neon Number:
import java.util.Scanner;
public class Neonnum  {
    public static void main(String[] args) {
        System.out.print("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int square = n * n;  
        int sum = 0;
        while (square != 0) {
            int rem = square % 10;  
            sum += rem;             
            square = square / 10;  
        }
        if (sum == n) {
            System.out.println(n + " is a Neon Number");
        } else {
            System.out.println(n + " is Not a Neon Number");
        }
        sc.close();
    }
}
