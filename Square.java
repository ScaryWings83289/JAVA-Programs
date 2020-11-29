/* WAP TO FIND POWER OF 2 */
import java.util.*;
public class Square {
    public static void main(String args[]) {
        int n,a,p;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the exponent: ");
        n = s.nextInt();
        a=n;
        p=1;
        while(n != 0){
            p = p*2;
            n--;
        }
        System.out.println("2^" + a + " is: " + p);
    }
}