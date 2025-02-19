// Add Two Complex Numbers
public class ComplexNumber {
    public static void complexNumber (String[] args) {
        double real1 = 3.0;
        double imaginary1 = 4.0;
        double real2 = 1.0;
        double imaginary2 = 2.0;
        double realSum = real1 + real2;
        double imaginarySum = imaginary1 + imaginary2;

        if (imaginarySum < 0) {
            System.out.println("Sum of Complex Numbers: " + realSum + " - " + Math.abs(imaginarySum) + "i");
        } else {
            System.out.println("Sum of Complex Numbers: " + realSum + " + " + imaginarySum + "i");
        }
    }
}
