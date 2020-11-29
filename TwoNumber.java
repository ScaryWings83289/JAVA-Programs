// Write program, which reads two number (assume that both have same number of digits). The program outputs the sum of product of corresponding digits. 
import java.util.*; 
import java.lang.*;
class TwoNumber {
    public static void main(String[] args) {
        String m, n;
        int prod = 0;
        Scanner s = new Scanner (System.in);
        System.out.print("Enter a number: ");
        m = s.next(); 
        System.out.print("Enter a number: ");
        n = s.next();       
        for (int i = 0; i < n.length(); i++) {             
            prod += Integer.parseInt(n.substring(i, i+1)) * Integer.parseInt(m.substring(i, i+1));         
        } 
        System.out.println("The Sum of product of consecutive digits are: " + prod);
    }
}