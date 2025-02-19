 // Check Armstrong Number between Two Integers in java without using function
import java.util.*;
public class armstrongNumber  {
    public static void main(String[] args) {
        System.out.print("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = n;   
        int arm = 0; 
        int rem;   
        while (n > 0) {
            rem = n % 10; 
            arm = (rem * rem * rem) + arm;  
            n = n / 10; 
        }
        if (c == arm) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
        sc.close();
    }
}
