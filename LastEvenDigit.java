// Write program to print the last even digit.
import java.util.*; 
import java.lang.*;
class LastEvenDigit {
    public static void main (String[] args)  { 
        int m, n;
        Scanner s = new Scanner (System.in);
        System.out.print("Enter a number: ");
        n = s.nextInt();
        while(n > 0){
            m= n % 10;
            if(m%2==0){
                System.out.println("Last even digit in given number is : " + m);
                break;
            }
            n = n/10;
        } 
    }
} 
