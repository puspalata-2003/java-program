// Get Input from the User java
import java.util.*;
public class userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine(); 
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
    }
}