// Write program to print the second last even digit.
import java.util.*; 
import java.lang.*;
class SecondLastEvenDigit {
    public static void main (String[] args)  { 
        int n;
        Scanner s = new Scanner (System.in);
        System.out.print("Enter a number: ");
        n = s.nextInt();
        while(n % 2 != 0) {
            n /= 10;
        }
        n /= 10;
        while(n % 2 != 0) {
            n /= 10;
        }
        System.out.println("The last second even number is: " + n%10);
    }
}