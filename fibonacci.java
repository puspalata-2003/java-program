 // Find Even Sum of Fibonacci Series Till number N
import java.util.*;
public class fibonacci  {
    public static void main(String[] args) {
        System.out.print("Enter the number N: ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = 0, b = 1;  
        int evenSum = 0;    
        while (a <= N) {
            if (a % 2 == 0) {
                evenSum += a;  
            }
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println("The sum of even Fibonacci numbers up to " + N + " is: " + evenSum);

        sc.close();
    }
}