
// Check whether input character is vowel or consonant
import java.util.Scanner;
public class vowelConsonant {
    public static void main(String[] args) {
        System.out.println("Enter a character:");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0); 
        ch = Character.toUpperCase(ch);
        switch (ch) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
                break;
        }
        sc.close();
    }
}