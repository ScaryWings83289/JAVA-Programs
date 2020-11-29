/* WAP TO FIND THE FACTORIAL OF A NUMBER */
import java.util.*;
public class Factorial {
    public static void main(String args[]) {
        int n,i,f;
        Scanner s = new Scanner (System.in);
        System.out.print("Enter a number: ");
        n = s.nextInt();
        f=1;
        for(i=1; i<=n; i++){
            f = f*i;
        }
        System.out.println("Factorial of " + n + " is: " + f);
    }
}