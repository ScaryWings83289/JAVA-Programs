// Write program, which will find sum of product to consecutive digits. 
import java.util.*; 
import java.lang.*;
class ProdConsecutiveDigit {
    public static void main(String[] args) {
        String n;
        int prod = 0;
        Scanner s = new Scanner (System.in);
        System.out.print("Enter a number: ");
        n = s.next();
        for (int i = 0; i < n.length() - 1; i++) {
            prod += Integer.parseInt(n.substring(i, i+1)) * Integer.parseInt(n.substring(i+1, i+2));
        }
        System.out.println("The Sum of product of consecutive digits are: " + prod);
    }
}