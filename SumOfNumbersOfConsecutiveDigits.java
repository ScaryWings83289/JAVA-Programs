// Write program, which finds the sum of numbers formed by consecutive digits.
import java.util.*; 
import java.lang.*;
class SumOfNumbersOfConsecutiveDigits {
    public static void main (String[] args)  { 
        int x, y=0,z=0,sum=0, m=0;
        Scanner s = new Scanner (System.in);
        System.out.print("Enter a number: ");
        x = s.nextInt();
        while (x>9){
            y = x%10;
            x = x/10;
            z = x%10;
            m = z*10;
            sum = sum + y + m;
        } 
        System.out.println("Sum of numbers formed by consecutive digits=" + sum);
    }
}