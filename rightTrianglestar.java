 // Right Triangle Star Pattern
public class rightTrianglestar  {
    public static void main(String[] args) {
        int rows = 5; 
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" "); 
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); 
            }
            System.out.println(); 
        }
    }
}